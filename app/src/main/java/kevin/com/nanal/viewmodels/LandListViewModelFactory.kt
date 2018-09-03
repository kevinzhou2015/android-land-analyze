package kevin.com.nanal.viewmodels

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import kevin.com.nanal.data.LandRepository
import kevin.com.nanal.utilities.LandListViewModel

class LandListViewModelFactory (
        private val repository: LandRepository
) : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>) = LandListViewModel(repository) as T
}
