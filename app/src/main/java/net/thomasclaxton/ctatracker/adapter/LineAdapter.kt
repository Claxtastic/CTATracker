package net.thomasclaxton.ctatracker.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import net.thomasclaxton.ctatracker.databinding.RowLineBinding
import net.thomasclaxton.ctatracker.model.Line

class LineAdapter(private val onItemClick: (Line) -> Unit): RecyclerView.Adapter<LineAdapter.LineViewHolder>() {

  var lines: List<Line> = listOf()
    set(newLines) {
      field = newLines
      notifyDataSetChanged()
    }

  inner class LineViewHolder(private val itemBinding: RowLineBinding, private val onItemClick: (Int) -> Unit): RecyclerView.ViewHolder(itemBinding.root) {
    fun bind(line: Line) {
      with(itemBinding) {
        tvLineName.text = line.name

        root.setOnClickListener {
          onItemClick(adapterPosition)
        }
      }
    }
  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LineViewHolder {
    val itemBinding = RowLineBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    return LineViewHolder(itemBinding) { onItemClick(lines[it]) }
  }

  override fun onBindViewHolder(holder: LineViewHolder, position: Int) {
    return holder.bind(lines[position])
  }

  override fun getItemCount(): Int {
    return lines.size
  }
}
