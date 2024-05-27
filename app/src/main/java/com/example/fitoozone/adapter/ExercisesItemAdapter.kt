package com.example.fitoozone.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.fitoozone.data.WorkoutItemData
import com.example.fitoozone.databinding.ExercisesItemLayoutBinding

class ExercisesItemAdapter(private val list: List<WorkoutItemData>) :
    RecyclerView.Adapter<ExercisesItemAdapter.ExercisesItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExercisesItemViewHolder {
        return ExercisesItemViewHolder(ExercisesItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ExercisesItemViewHolder, position: Int) {
        list[position].let {
            holder.binding.apply {
                itemImage.load(it.image)
                exercisesTitle.text = it.title
            }
        }
    }

    inner class ExercisesItemViewHolder(val binding: ExercisesItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root)
}
