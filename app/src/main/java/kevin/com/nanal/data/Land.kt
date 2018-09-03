package kevin.com.nanal.data

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "lands")
data class Land(
        @PrimaryKey @ColumnInfo(name = "id") var id: Int = 0,
        var owner: String = "",
        var insurance: Int = 0,
        var businessShare: String = "",
        var acreage: Int = 0,
        var floorStartPrice: Int = 0,
        var pathlat: String = "",
        var startPrice: Int = 0,
        var floorFinalPrice: Int = 0,
        var fourBound: String = "",
        var createdAt: String = "",
        var natureOfLand: String = "",
        var pathlng: String = "",
        var transferTime: String = "",
        var finalPrice: Int = 0,
        var district: String = "",
        var name: String = "",
        var premiumRate: Double = 0.0,
        var volumeRate: String = "",
        var updatedAt: String = "") {
    override fun toString() = name
}