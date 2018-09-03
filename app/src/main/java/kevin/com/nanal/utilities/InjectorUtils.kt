package kevin.com.nanal.utilities

import android.content.Context
import kevin.com.nanal.data.AppDatabase
import kevin.com.nanal.data.LandRepository
import kevin.com.nanal.viewmodels.LandListViewModelFactory

object InjectorUtils {
    private fun getLandRepository(context: Context): LandRepository {
        return LandRepository.getInstance(AppDatabase.getInstance(context).landDao())
    }

    fun providePlantListViewModelFactory(context: Context): LandListViewModelFactory {
        val repository = getLandRepository(context)
        return LandListViewModelFactory(repository)
    }
}