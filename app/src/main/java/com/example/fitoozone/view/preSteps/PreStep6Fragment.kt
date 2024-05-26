package com.example.fitoozone.view.preSteps

import androidx.navigation.fragment.findNavController
import com.example.fitoozone.R
import com.example.fitoozone.base.BaseFragment
import com.example.fitoozone.databinding.FragmentPreStep6Binding

class PreStep6Fragment : BaseFragment<FragmentPreStep6Binding>(FragmentPreStep6Binding::inflate) {
    override fun setListener() {
        binding.btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_preStep6Fragment_to_preStep7Fragment)
        }
    }

    override fun allObserver() {
    }

}