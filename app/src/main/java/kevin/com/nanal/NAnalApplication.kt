package kevin.com.nanal

import android.app.Application
import com.avos.avoscloud.AVOSCloud
import com.baidu.mapapi.CoordType
import com.baidu.mapapi.SDKInitializer
import com.blankj.utilcode.util.Utils
import com.facebook.stetho.Stetho
import net.idik.lib.cipher.so.CipherClient



/**
 * Created on 31/08/2018 by kevin.
 *  --- The most handsome man in the world
 */
class NAnalApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        SDKInitializer.initialize(this)
        //自4.3.0起，百度地图SDK所有接口均支持百度坐标和国测局坐标，用此方法设置您使用的坐标类型.
        //包括BD09LL和GCJ02两种坐标，默认是BD09LL坐标。
        SDKInitializer.setCoordType(CoordType.BD09LL)
        Stetho.initializeWithDefaults(this)

        AVOSCloud.initialize(this,CipherClient.leancloudId(),CipherClient.leancloudKey())
        AVOSCloud.setDebugLogEnabled(BuildConfig.DEBUG)
        Utils.init(this)

    }
}