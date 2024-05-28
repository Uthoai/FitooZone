package com.example.fitoozone.view.preSteps

import android.content.Intent
import android.widget.AdapterView
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import com.example.fitoozone.R
import com.example.fitoozone.base.BaseFragment
import com.example.fitoozone.adapter.ListAdapter
import com.example.fitoozone.data.ListData
import com.example.fitoozone.databinding.FragmentPreStep8Binding
import com.example.fitoozone.view.LandingActivity
import com.example.fitoozone.view.SplashActivity

class PreStep8Fragment : BaseFragment<FragmentPreStep8Binding>(FragmentPreStep8Binding::inflate) {
    private lateinit var listAdapter: ListAdapter
    private lateinit var listData: ListData
    var dataArrayList = ArrayList<ListData?>()

    val imageList = intArrayOf(
        R.drawable.ic_cardio,
        R.drawable.ic_power_training,
        R.drawable.ic_stretch,
        R.drawable.ic_dancing,
        R.drawable.ic_yoga,
    )
    val nameList = arrayOf("Cardio", "Power Training", "Stretch", "Dancing", "Yoga")

    override fun setListener() {
        dataArrayList.clear()
        for (i in imageList.indices) {
            listData = ListData(
                imageList[i],
                nameList[i]
            )
            dataArrayList.add(listData)
        }

        listAdapter = ListAdapter(requireContext(), dataArrayList)
        binding.listview.adapter = listAdapter
        binding.listview.isClickable = true
        binding.listview.itemsCanFocus = true

        binding.listview.onItemClickListener =
            AdapterView.OnItemClickListener { _, view, i, _ ->
                view.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.lavender))
            }

        binding.btnNext.setOnClickListener {
            startActivity(Intent(requireContext(), SplashActivity::class.java))
            requireActivity().finish()
        }
    }

    override fun allObserver() {
    }

}