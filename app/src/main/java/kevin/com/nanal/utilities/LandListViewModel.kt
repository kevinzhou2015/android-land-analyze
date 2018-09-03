package kevin.com.nanal.utilities

import android.arch.lifecycle.MediatorLiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.Transformations
import android.arch.lifecycle.ViewModel
import kevin.com.nanal.data.Land
import kevin.com.nanal.data.LandRepository

class LandListViewModel internal constructor(
        private val landRepository: LandRepository
) : ViewModel() {

    private val growZoneNumber = MutableLiveData<Int>()

    private val landList = MediatorLiveData<List<Land>>()

    init {

        val liveLandList = Transformations.switchMap(growZoneNumber) {
            landRepository.getPlants()
        }
        landList.addSource(liveLandList, landList::setValue)
    }

    fun getPlants() = landList
}