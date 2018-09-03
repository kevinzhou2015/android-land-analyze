package kevin.com.nanal.data

class LandRepository private constructor(private val landDao: LandDao) {

    fun getPlants() = landDao.getLands()

    fun getPlant(landId: String) = landDao.getLand(landId)

    companion object {

        // For Singleton instantiation
        @Volatile private var instance: LandRepository? = null

        fun getInstance(landDao: LandDao) =
                instance ?: synchronized(this) {
                    instance ?: LandRepository(landDao).also { instance = it }
                }
    }
}