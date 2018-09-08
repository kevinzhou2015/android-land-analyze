package kevin.com.nanal.viewmodels

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import kevin.com.nanal.data.Land
import kevin.com.nanal.data.LandRepository

class LandListViewModel internal constructor(
    landRepository: LandRepository
) : ViewModel() {
    private val landList: LiveData<List<Land>> = landRepository.getLands()
    fun getLands() = landList
    var selectedPlant: MutableLiveData<Land> = MutableLiveData()
}