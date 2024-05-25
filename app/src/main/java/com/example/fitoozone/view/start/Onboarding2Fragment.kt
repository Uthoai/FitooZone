package com.example.fitoozone.view.start

import androidx.navigation.fragment.findNavController
import com.example.fitoozone.R
import com.example.fitoozone.base.BaseFragment
import com.example.fitoozone.databinding.FragmentOnboarding2Binding

class Onboarding2Fragment : BaseFragment<FragmentOnboarding2Binding>(FragmentOnboarding2Binding::inflate) {
    override fun setListener() {
        binding.btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_onboarding2Fragment_to_signInFragment)
        }
    }

    override fun allObserver() {
    }

}