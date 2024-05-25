package com.example.fitoozone.view.start

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.fitoozone.R
import com.example.fitoozone.base.BaseFragment
import com.example.fitoozone.databinding.FragmentOnboarding1Binding

class Onboarding1Fragment : BaseFragment<FragmentOnboarding1Binding>(FragmentOnboarding1Binding::inflate) {
    override fun setListener() {
        binding.btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_onboarding1Fragment_to_onboarding2Fragment)
        }
    }

    override fun allObserver() {
    }

}