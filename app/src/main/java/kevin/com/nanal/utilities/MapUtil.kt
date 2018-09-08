package kevin.com.nanal.utilities

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.TextView
import com.baidu.mapapi.map.BaiduMap
import com.baidu.mapapi.map.BitmapDescriptorFactory
import com.baidu.mapapi.map.MarkerOptions
import com.baidu.mapapi.map.PolygonOptions
import com.baidu.mapapi.map.Stroke
import com.baidu.mapapi.model.LatLng
import kevin.com.nanal.R
import kevin.com.nanal.data.Land

fun getCenterOfGravityPoint(mPoints: List<LatLng>): LatLng {
    var area = 0.0//多边形面积
    var gx = 0.0
    var gy = 0.0// 重心的x、y
    for (i in 1..mPoints.size) {
        val iLat = mPoints[i % mPoints.size].latitude
        val iLng = mPoints[i % mPoints.size].longitude
        val nextLat = mPoints[i - 1].latitude
        val nextLng = mPoints[i - 1].longitude
        val temp = (iLat * nextLng - iLng * nextLat) / 2.0
        area += temp
        gx += temp * (iLat + nextLat) / 3.0
        gy += temp * (iLng + nextLng) / 3.0
    }
    gx /= area
    gy /= area
    return LatLng(gx, gy)
}

fun getSelectedMarkerOp(
    it: Land,
    pts: ArrayList<LatLng>,
    context: Context?
): MarkerOptions? {
    val bu = Bundle()
    bu.putParcelable("land", it)
    //在地图上添加多边形Option，用于显示
    val centerPoi = getCenterOfGravityPoint(pts)
    val li = LayoutInflater.from(context)
    val cv = li.inflate(R.layout.land_icon, null)
    cv.findViewById<TextView>(R.id.textView).text =
        String.format("%.1f", (it.floor_final_price).toFloat() / 10000)
    val ooA = MarkerOptions().perspective(false).position(centerPoi)
        .icon(BitmapDescriptorFactory.fromView(cv))
        .zIndex(9).anchor(0.5f, 0.5f).extraInfo(bu)
    return ooA
}

fun drawLand(it: Land, context: Context?, baiduMap: BaiduMap) {
    val latList = it.pathlat.split(";")
    val lngList = it.pathlng.split(";")
    if (latList.count() > 1) {
        val pts = ArrayList<LatLng>()
        for (i in latList.indices) {
            if (!latList[i].isEmpty()) pts.add(
                LatLng(
                    lngList[i].toDouble(),
                    latList[i].toDouble()
                )
            )
        }
        val polygonOption = PolygonOptions()
            .points(pts)
            .stroke(Stroke(1, -0x55010000))
            .fillColor(0x00000000)


        baiduMap.addOverlay(polygonOption)

        baiduMap.addOverlay(getSelectedMarkerOp(it, pts, context))
    }
}