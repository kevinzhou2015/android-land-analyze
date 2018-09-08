package kevin.com.nanal

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.design.widget.BottomSheetBehavior
import android.support.v4.app.Fragment
import android.support.v4.widget.NestedScrollView
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.baidu.mapapi.map.BaiduMap
import com.baidu.mapapi.map.BitmapDescriptorFactory
import com.baidu.mapapi.map.MapStatusUpdateFactory
import com.baidu.mapapi.map.MapView
import com.baidu.mapapi.map.Marker
import com.baidu.mapapi.map.MarkerOptions
import com.baidu.mapapi.map.MyLocationConfiguration
import com.baidu.mapapi.map.MyLocationData
import com.baidu.mapapi.model.LatLng
import kevin.com.nanal.adapters.LandSimpleAdapter
import kevin.com.nanal.data.Land
import kevin.com.nanal.databinding.FragmentBmapBinding
import kevin.com.nanal.utilities.InjectorUtils
import kevin.com.nanal.utilities.drawLand
import kevin.com.nanal.viewmodels.LandListViewModel

class BMapFragment : Fragment() {
    private var locData: MyLocationData? = null
    private var centerPoint = LatLng(30.249105, 120.253356)
    private var zoom = 17f
    private lateinit var viewModel: LandListViewModel
    private var selectedMarker: Marker? = null

    private lateinit var baiduMap: BaiduMap

    private lateinit var bottomSheet: NestedScrollView
    private lateinit var mBottomSheetBehavior: BottomSheetBehavior<NestedScrollView>
    private lateinit var mRecyclerView :RecyclerView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val factory = InjectorUtils.providePlantListViewModelFactory(requireContext())
        val landListViewModel = ViewModelProviders.of(this, factory).get(LandListViewModel::class.java)
        viewModel = landListViewModel
        val binding = DataBindingUtil.inflate<FragmentBmapBinding>(
            inflater, R.layout.fragment_bmap, container, false).apply {
            viewModel = landListViewModel
            setLifecycleOwner(this@BMapFragment)
            baiduMap =root.findViewById<MapView>(R.id.bmapFragment).map
            bottomSheet = bottomsheet
            mBottomSheetBehavior = BottomSheetBehavior.from(bottomSheet)
            mBottomSheetBehavior.state= BottomSheetBehavior.STATE_HIDDEN
            recyclerView.layoutManager = GridLayoutManager(context, 2, GridLayoutManager.VERTICAL, false)
            val adapter = LandSimpleAdapter(root.context)
            recyclerView.adapter = adapter
            mRecyclerView = recyclerView

            subscribeUi(adapter)
        }

        return binding.root
    }

    private fun subscribeUi(adapter: LandSimpleAdapter) {

        viewModel.getLands().observe(this, Observer { lands ->
            lands?.forEach {
                drawLand(it,context,baiduMap)
            }
        })

        viewModel.selectedPlant.observe(this, Observer {
            if (it != null ) adapter.submitLand(it)
        })
        baiduMap.setOnMarkerClickListener {
            selectedMarker?.remove()
            val ooA = MarkerOptions().perspective(false).position(it.position)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_location))
                .zIndex(9).anchor(0.5f, 1.0f)
            selectedMarker = baiduMap.addOverlay(ooA) as Marker
            val u = MapStatusUpdateFactory.newLatLng(it.position)
            baiduMap.animateMapStatus(u)
            val land = it.extraInfo.getParcelable<Land>("land")
            viewModel.selectedPlant.value =land
            mBottomSheetBehavior.state= BottomSheetBehavior.STATE_EXPANDED
            true
        }
    }



    override fun onViewCreated(p0: View, p1: Bundle?) {
        super.onViewCreated(p0, p1)
        initMap()
    }

    private fun initMap() {
        val mCurrentMode = MyLocationConfiguration.LocationMode.FOLLOWING   //默认为 LocationMode.NORMAL 普通态
        val mCurrentMarker = BitmapDescriptorFactory.fromResource(R.drawable.icon_geo)
        val accuracyCircleFillColor = 0xAAFFFF88//自定义精度圈填充颜色
        val accuracyCircleStrokeColor = 0xAA00FF00//自定义精度圈边框颜色
        baiduMap.isMyLocationEnabled = true
        baiduMap.setMyLocationConfiguration(
            MyLocationConfiguration(
                mCurrentMode, true, mCurrentMarker,
                accuracyCircleFillColor.toInt(), accuracyCircleStrokeColor.toInt()
            )
        )
        locData = MyLocationData.Builder().latitude(centerPoint.latitude)
            .longitude(centerPoint.longitude).build()
        baiduMap.setMyLocationData(locData)
        baiduMap.animateMapStatus(MapStatusUpdateFactory.zoomTo(zoom))
    }
}