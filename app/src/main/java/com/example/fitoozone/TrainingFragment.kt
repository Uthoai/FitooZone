package com.example.fitoozone

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fitoozone.adapter.WorkoutItemAdapter
import com.example.fitoozone.base.BaseFragment
import com.example.fitoozone.data.WorkoutItemData
import com.example.fitoozone.databinding.FragmentTrainingBinding

class TrainingFragment : BaseFragment<FragmentTrainingBinding>(FragmentTrainingBinding::inflate) {
    private lateinit var workoutItemAdapter: WorkoutItemAdapter

    val workoutsItem = listOf(
        WorkoutItemData(R.drawable.workouts_1,"Rapid Lower Body"),
        WorkoutItemData(R.drawable.workouts_2,"Bodyweight Stretch"),
        WorkoutItemData(R.drawable.workouts_3,"Core Control"),
        WorkoutItemData(R.drawable.workouts_4,"Glutes & Abs"),
        WorkoutItemData(R.drawable.workouts_1,"Rapid Lower Body"),
        WorkoutItemData(R.drawable.workouts_2,"Bodyweight Stretch"),
        WorkoutItemData(R.drawable.workouts_3,"Core Control"),
        WorkoutItemData(R.drawable.workouts_4,"Glutes & Abs"),
        WorkoutItemData(R.drawable.workouts_1,"Rapid Lower Body"),
        WorkoutItemData(R.drawable.workouts_2,"Bodyweight Stretch"),
        WorkoutItemData(R.drawable.workouts_3,"Core Control"),
        WorkoutItemData(R.drawable.workouts_4,"Glutes & Abs"),
    )
    override fun setListener() {
        workoutItemAdapter = WorkoutItemAdapter(workoutsItem)
        binding.workoutItemRecycler.adapter = workoutItemAdapter
    }

    override fun allObserver() {
    }

}