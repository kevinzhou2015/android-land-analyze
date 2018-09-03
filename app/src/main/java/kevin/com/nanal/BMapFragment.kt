package kevin.com.nanal

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.baidu.mapapi.map.*
import kevin.com.nanal.data.AppDatabase
import com.baidu.mapapi.map.MyLocationData
import com.baidu.mapapi.model.LatLng
import kevin.com.nanal.utilities.InjectorUtils
import kevin.com.nanal.utilities.LandListViewModel
import android.arch.lifecycle.Observer
import android.util.Log

class BMapFragment : SupportMapFragment {
    private var locData: MyLocationData? = null
    private var centerPoint =  LatLng(30.249105,120.253356);
    private var zoom =  17f;

    private lateinit var viewModel: LandListViewModel
    constructor() : super() {
        val builder = MapStatus.Builder()
        builder.overlook(-20F).zoom(15F)
        val bo = BaiduMapOptions().mapStatus(builder.build())
                .compassEnabled(false).zoomControlsEnabled(false)



    }

    override fun onCreateView(p0: LayoutInflater, p1: ViewGroup?, p2: Bundle?): View? {
        val view =  super.onCreateView(p0, p1, p2)
        subscribeUi()
        return view
    }
    private fun subscribeUi() {
        val factory = InjectorUtils.providePlantListViewModelFactory(requireContext())
        viewModel = ViewModelProviders.of(this, factory).get(LandListViewModel::class.java)
        viewModel.getPlants().observe(viewLifecycleOwner, Observer { lands ->
            if (lands != null) {
                Log.e("ddddd",lands[0].name)
            }
        })
    }
    override fun onViewCreated(p0: View, p1: Bundle?) {
        super.onViewCreated(p0, p1)
        initMap()
    }

    private fun initMap() {
        val mCurrentMode = MyLocationConfiguration.LocationMode.FOLLOWING;   //默认为 LocationMode.NORMAL 普通态
        val mCurrentMarker = BitmapDescriptorFactory.fromResource(R.drawable.icon_geo);
        val accuracyCircleFillColor = 0xAAFFFF88;//自定义精度圈填充颜色
        val accuracyCircleStrokeColor = 0xAA00FF00;//自定义精度圈边框颜色
        baiduMap.isMyLocationEnabled = true;
        baiduMap.setMyLocationConfiguration(MyLocationConfiguration(
                mCurrentMode, true, mCurrentMarker,
                accuracyCircleFillColor.toInt(), accuracyCircleStrokeColor.toInt()))
        locData = MyLocationData.Builder().latitude(centerPoint.latitude)
                .longitude(centerPoint.longitude).build()
        baiduMap.setMyLocationData(locData)
        baiduMap.animateMapStatus(MapStatusUpdateFactory.zoomTo(zoom));
    }
}