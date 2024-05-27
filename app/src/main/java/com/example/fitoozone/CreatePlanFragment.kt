package com.example.fitoozone

import android.content.Intent
import com.example.fitoozone.base.BaseFragment
import com.example.fitoozone.databinding.FragmentCreatePlanBinding
import com.example.fitoozone.view.LandingActivity

class CreatePlanFragment : BaseFragment<FragmentCreatePlanBinding>(FragmentCreatePlanBinding::inflate) {
    override fun setListener() {
        binding.btnNext.setOnClickListener {
            startActivity(Intent(requireContext(), LandingActivity::class.java))
            requireActivity().finish()
        }
    }

    override fun allObserver() {
    }

}