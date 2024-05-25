package com.example.fitoozone.view.start

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.fitoozone.R
import com.example.fitoozone.base.BaseFragment
import com.example.fitoozone.databinding.FragmentWelcomeBinding

class WelcomeFragment : BaseFragment<FragmentWelcomeBinding>(FragmentWelcomeBinding::inflate) {
    override fun setListener() {
        binding.btnGetStart.setOnClickListener {
            findNavController().navigate(R.id.action_welcomeFragment_to_onboarding1Fragment)
        }
    }

    override fun allObserver() {
    }

}