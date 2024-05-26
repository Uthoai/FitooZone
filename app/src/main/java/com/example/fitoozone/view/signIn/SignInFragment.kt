package com.example.fitoozone.view.signIn

import android.content.Intent
import androidx.navigation.fragment.findNavController
import com.example.fitoozone.R
import com.example.fitoozone.base.BaseFragment
import com.example.fitoozone.databinding.FragmentSignInBinding
import com.example.fitoozone.view.dashboard.DashboardActivity

class SignInFragment : BaseFragment<FragmentSignInBinding>(FragmentSignInBinding::inflate) {
    override fun setListener() {
        binding.btnSignIn.setOnClickListener {
            startActivity(Intent(requireContext(),DashboardActivity::class.java))
            requireActivity().finish()
        }
        binding.tvSignup.setOnClickListener {
            findNavController().navigate(R.id.action_signInFragment_to_signUpFragment)
        }
    }

    override fun allObserver() {
    }
}