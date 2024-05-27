package com.example.fitoozone.view.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import com.example.fitoozone.R
import com.example.fitoozone.adapter.CategoryItemAdapter
import com.example.fitoozone.adapter.ExercisesItemAdapter
import com.example.fitoozone.adapter.WorkoutItemAdapter
import com.example.fitoozone.base.BaseFragment
import com.example.fitoozone.data.ListData
import com.example.fitoozone.data.WorkoutItemData
import com.example.fitoozone.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {
    private lateinit var categoryItemAdapter: CategoryItemAdapter
    private lateinit var workoutItemAdapter: WorkoutItemAdapter
    private lateinit var exercisesItemAdapter: ExercisesItemAdapter

    val categoryItem = listOf(
        ListData(R.drawable.ic_cardio, "Cardio"),
        ListData(R.drawable.ic_yoga, "Yoga"),
        ListData(R.drawable.ic_power_training, "Power"),
        ListData(R.drawable.ic_stretch, "Stretch"),
        ListData(R.drawable.ic_cardio, "Cardio"),
        ListData(R.drawable.ic_yoga, "Yoga"),
        ListData(R.drawable.ic_power_training, "Power"),
        ListData(R.drawable.ic_stretch, "Stretch"),
    )

    val workoutsItem = listOf(
        WorkoutItemData(R.drawable.workouts_1,"Rapid Lower Body"),
        WorkoutItemData(R.drawable.workouts_2,"Bodyweight Stretch"),
        WorkoutItemData(R.drawable.workouts_3,"Core Control"),
        WorkoutItemData(R.drawable.workouts_4,"Glutes & Abs"),
    )

    val exercisesItem = listOf(
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
        setRecyclerData()
        setRecycler1Data()
        setRecycler2Data()

    }

    private fun setRecyclerData(){
        categoryItemAdapter = CategoryItemAdapter(categoryItem)
        binding.categoryItemList.adapter = categoryItemAdapter
    }

    private fun setRecycler1Data(){
        workoutItemAdapter = WorkoutItemAdapter(workoutsItem)
        binding.workoutItemRecycler.adapter = workoutItemAdapter
    }
    private fun setRecycler2Data(){
        exercisesItemAdapter = ExercisesItemAdapter(exercisesItem)
        binding.exercisesItemRecycler.adapter = exercisesItemAdapter
    }

    override fun allObserver() {
    }

}