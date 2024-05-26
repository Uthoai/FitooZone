package com.example.fitoozone.view.preSteps

import androidx.navigation.fragment.findNavController
import com.example.fitoozone.R
import com.example.fitoozone.base.BaseFragment
import com.example.fitoozone.databinding.FragmentPreStep5Binding

class PreStep5Fragment : BaseFragment<FragmentPreStep5Binding>(FragmentPreStep5Binding::inflate) {
    override fun setListener() {
        binding.btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_preStep5Fragment_to_preStep6Fragment)
        }
    }

    override fun allObserver() {
    }

}