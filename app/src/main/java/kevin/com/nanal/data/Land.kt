package kevin.com.nanal.data

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.os.Parcel
import android.os.Parcelable
@Entity(tableName = "lands")
data class Land(
        @PrimaryKey @ColumnInfo(name = "id") var id: Int = 0,
        var owner: String = "",
        var insurance: Int = 0,
        var business_share: String? = "",
        var acreage: Int = 0,
        var floor_final_price: Int = 0,
        var pathlat: String = "",
        var start_price: Int = 0,
        var floor_start_price: Int = 0,
        var four_bound: String? = "",
        var createdAt: String = "",
        var nature_of_land: String = "",
        var pathlng: String = "",
        var transfer_time: String = "",
        var final_price: Int = 0,
        var district: String = "",
        var name: String = "",
        var premium_rate: Double = 0.0,
        var volume_rate: String = "",
        var updatedAt: String = ""
) : Parcelable {
        override fun toString() = name

        constructor(source: Parcel) : this(
                source.readInt(),
                source.readString(),
                source.readInt(),
                source.readString(),
                source.readInt(),
                source.readInt(),
                source.readString(),
                source.readInt(),
                source.readInt(),
                source.readString(),
                source.readString(),
                source.readString(),
                source.readString(),
                source.readString(),
                source.readInt(),
                source.readString(),
                source.readString(),
                source.readDouble(),
                source.readString(),
                source.readString()
        )

        override fun describeContents() = 0

        override fun writeToParcel(dest: Parcel, flags: Int) = with(dest) {
                writeInt(id)
                writeString(owner)
                writeInt(insurance)
                writeString(business_share)
                writeInt(acreage)
                writeInt(floor_final_price)
                writeString(pathlat)
                writeInt(start_price)
                writeInt(floor_start_price)
                writeString(four_bound)
                writeString(createdAt)
                writeString(nature_of_land)
                writeString(pathlng)
                writeString(transfer_time)
                writeInt(final_price)
                writeString(district)
                writeString(name)
                writeDouble(premium_rate)
                writeString(volume_rate)
                writeString(updatedAt)
        }

        companion object {
                @JvmField
                val CREATOR: Parcelable.Creator<Land> = object : Parcelable.Creator<Land> {
                        override fun createFromParcel(source: Parcel): Land = Land(source)
                        override fun newArray(size: Int): Array<Land?> = arrayOfNulls(size)
                }
        }
}