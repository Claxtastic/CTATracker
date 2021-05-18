package net.thomasclaxton.ctatracker.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import net.thomasclaxton.ctatracker.databinding.RowEtaBinding
import net.thomasclaxton.ctatracker.model.ETA

class ETAAdapter(var etas: List<ETA>): RecyclerView.Adapter<ETAAdapter.ETAViewHolder>() {

  inner class ETAViewHolder(private val itemBinding: RowEtaBinding): RecyclerView.ViewHolder(itemBinding.root) {
    fun bind(eta: ETA) {
      with(itemBinding) {
        tvRunNumber.text = eta.runNumber
        tvArrivalTime.text = eta.arrivalTime
      }
    }
  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ETAViewHolder {
    val itemBinding = RowEtaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    return ETAViewHolder(itemBinding)
  }

  override fun onBindViewHolder(holder: ETAViewHolder, position: Int) {
    return holder.bind(etas[position])
  }

  override fun getItemCount(): Int {
    return etas.size
  }

  fun refreshEtas(etas: List<ETA>) {
    this.etas = etas
    notifyDataSetChanged()
  }
}
