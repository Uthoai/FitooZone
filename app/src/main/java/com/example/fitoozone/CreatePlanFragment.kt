package com.example.fitoozone

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.fitoozone.base.BaseFragment
import com.example.fitoozone.databinding.FragmentCreatePlanBinding
import com.example.fitoozone.view.dashboard.DashboardActivity

class CreatePlanFragment : BaseFragment<FragmentCreatePlanBinding>(FragmentCreatePlanBinding::inflate) {
    override fun setListener() {
        binding.btnNext.setOnClickListener {
            startActivity(Intent(requireContext(), DashboardActivity::class.java))
            requireActivity().finish()
        }
    }

    override fun allObserver() {
    }

}