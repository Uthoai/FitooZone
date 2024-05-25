package com.example.fitoozone.view.signIn

import androidx.navigation.fragment.findNavController
import com.example.fitoozone.R
import com.example.fitoozone.base.BaseFragment
import com.example.fitoozone.databinding.FragmentSignInBinding

class SignInFragment : BaseFragment<FragmentSignInBinding>(FragmentSignInBinding::inflate) {
    override fun setListener() {
        binding.tvSignup.setOnClickListener {
            findNavController().navigate(R.id.action_signInFragment_to_signUpFragment)
        }
    }

    override fun allObserver() {
    }
}