package kevin.com.nanal.data

import android.arch.persistence.db.SupportSQLiteDatabase
import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.TypeConverters
import android.content.Context
import android.util.Log
import androidx.work.WorkManager
import androidx.work.OneTimeWorkRequestBuilder
import kevin.com.nanal.utilities.DATABASE_NAME
import kevin.com.nanal.workers.LandDatabaseWorker

@Database(entities = [Land::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun landDao(): LandDao

    companion object {
        private val TAG = AppDatabase::class.java.simpleName
        // For Singleton instantiation
        @Volatile private var instance: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            return instance ?: synchronized(this) {
                Log.i(TAG,"database synchronized")
                instance ?: buildDatabase(context).also { instance = it }
            }
        }

        private fun buildDatabase(context: Context): AppDatabase {
            Log.i(TAG,"database buildDatabase")
            return Room.databaseBuilder(context, AppDatabase::class.java, DATABASE_NAME)
                    .addCallback(object : RoomDatabase.Callback() {
                        override fun onCreate(db: SupportSQLiteDatabase) {
                            super.onCreate(db)
                            Log.i(TAG,"database oncreate")
                            val request = OneTimeWorkRequestBuilder<LandDatabaseWorker>().build()
                            WorkManager.getInstance().enqueue(request)
                        }

                    })
                    .build()
        }
    }
}