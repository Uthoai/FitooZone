package com.example.fitoozone.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.fitoozone.data.WorkoutItemData
import com.example.fitoozone.databinding.WorkoutsItemLayoutBinding

class WorkoutItemAdapter(private val list: List<WorkoutItemData>) :
    RecyclerView.Adapter<WorkoutItemAdapter.WorkoutViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WorkoutViewHolder {
        return WorkoutViewHolder(
            WorkoutsItemLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: WorkoutViewHolder, position: Int) {
        list[position].let {
            holder.binding.apply {
                itemImage.load(it.image)
                exercisesTitle.text = it.title
            }
        }
    }

    inner class WorkoutViewHolder(val binding: WorkoutsItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root)
}
