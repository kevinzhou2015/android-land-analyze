package kevin.com.nanal.adapters

import android.content.Context
import android.databinding.DataBindingUtil
import android.databinding.ObservableField
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import kevin.com.nanal.R
import kevin.com.nanal.data.Land
import kevin.com.nanal.databinding.SimpleLandCardBinding
import kevin.com.nanal.viewmodels.SimpleLandViewModel

class LandSimpleAdapter(val context: Context) : RecyclerView.Adapter<LandSimpleAdapter.ViewHolder>() {
    private var infoList: MutableList<SimpleLandViewModel> = mutableListOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.simple_land_card, parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder) {
            bind(infoList[position])
        }
    }

    override fun getItemCount(): Int {
        return infoList.size
    }

    fun submitLand(land: Land) {
        infoList.clear()
        infoList.add(
            SimpleLandViewModel(
                ObservableField(context.getString(R.string.land_owner)),
                ObservableField(land.owner)
            )
        )
        infoList.add(
            SimpleLandViewModel(
                ObservableField(context.getString(R.string.floor_final_price)),
                ObservableField(land.floor_final_price.toString())
            )
        )
        infoList.add(
            SimpleLandViewModel(
                ObservableField(context.getString(R.string.estimate_apart_amout)),
                ObservableField(((land.volume_rate.substringAfter("-").toFloat() * land.acreage) / 100).toString())
            )
        )
        infoList.add(
            SimpleLandViewModel(
                ObservableField(context.getString(R.string.transfer_time)),
                ObservableField(land.transfer_time.slice(0..9))
            )
        )

        notifyDataSetChanged()
    }

    class ViewHolder(
        private val binding: SimpleLandCardBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(info: SimpleLandViewModel) {
            with(binding) {
                setInfo(info)
                executePendingBindings()
            }
        }
    }
}