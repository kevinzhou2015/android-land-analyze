package kevin.com.nanal.data

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query

@Dao
interface LandDao {
    @Query("SELECT * FROM lands ORDER BY name")
    fun getLands(): LiveData<List<Land>>

    @Query("SELECT * FROM lands WHERE id = :landId")
    fun getLand(landId: String): LiveData<Land>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(lands: List<Land>)
    
}