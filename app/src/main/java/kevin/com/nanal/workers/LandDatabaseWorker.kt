package kevin.com.nanal.workers

import android.util.Log
import androidx.work.Worker
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.google.gson.stream.JsonReader
import kevin.com.nanal.data.AppDatabase
import kevin.com.nanal.data.Land
import kevin.com.nanal.utilities.LAND_DATA_FILENAME

class LandDatabaseWorker : Worker() {
    private val TAG = LandDatabaseWorker::class.java.simpleName

    override fun doWork(): Worker.Result {
        val plantType = object : TypeToken<List<Land>>() {}.type
        var jsonReader: JsonReader? = null

        return try {
            val inputStream = applicationContext.assets.open(LAND_DATA_FILENAME)
            jsonReader = JsonReader(inputStream.reader())
            val landList: List<Land> = Gson().fromJson(jsonReader, plantType)
            val database = AppDatabase.getInstance(applicationContext)
            database.landDao().insertAll(landList)
            Worker.Result.SUCCESS
        } catch (ex: Exception) {
            Log.e(TAG, "Error seeding database", ex)
            Worker.Result.FAILURE
        } finally {
            jsonReader?.close()
        }
    }
}