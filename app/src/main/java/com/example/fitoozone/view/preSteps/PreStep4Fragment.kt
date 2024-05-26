package com.example.fitoozone.view.preSteps

import androidx.navigation.fragment.findNavController
import com.example.fitoozone.R
import com.example.fitoozone.base.BaseFragment
import com.example.fitoozone.databinding.FragmentPreStep4Binding

class PreStep4Fragment : BaseFragment<FragmentPreStep4Binding>(FragmentPreStep4Binding::inflate) {
    override fun setListener() {
        binding.btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_preStep4Fragment_to_preStep5Fragment)
        }
    }

    override fun allObserver() {
    }

}