package com.example.fitoozone.view.preSteps

import android.app.DatePickerDialog
import androidx.navigation.fragment.findNavController
import com.example.fitoozone.R
import com.example.fitoozone.base.BaseFragment
import com.example.fitoozone.databinding.FragmentPreStep3Binding
import java.util.Calendar

class PreStep3Fragment : BaseFragment<FragmentPreStep3Binding>(FragmentPreStep3Binding::inflate) {
    private var selectedDate = ""
    override fun setListener() {
        binding.icCalender.setOnClickListener {
            clickDatePicker()
        }

        binding.btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_preStep3Fragment_to_preStep4Fragment)
        }
    }

    private fun clickDatePicker() {
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)
        DatePickerDialog(
            requireContext(),
            { view, selectedYear, selectedMonth, selectedDayOfMonth ->
                selectedDate = "${selectedDayOfMonth}/${selectedMonth + 1}/${selectedYear}"
                binding.tvSelectedDate.text = selectedDate
            },
            year,
            month,
            day
        ).show()
    }

    override fun allObserver() {
    }

}