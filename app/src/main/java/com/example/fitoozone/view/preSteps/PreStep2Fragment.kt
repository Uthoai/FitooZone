package com.example.fitoozone.view.preSteps

import android.widget.AdapterView
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import com.example.fitoozone.R
import com.example.fitoozone.base.BaseFragment
import com.example.fitoozone.adapter.ListAdapter
import com.example.fitoozone.data.ListData
import com.example.fitoozone.databinding.FragmentPreStep2Binding

class PreStep2Fragment : BaseFragment<FragmentPreStep2Binding>(FragmentPreStep2Binding::inflate) {
    private lateinit var listAdapter: ListAdapter
    private lateinit var listData: ListData
    var dataArrayList = ArrayList<ListData?>()

    val imageList = intArrayOf(
        R.drawable.ic_weight_scale,
        R.drawable.ic_keep_fit,
        R.drawable.ic_get_stronger,
        R.drawable.ic_gain_muscle
    )
    val nameList = arrayOf("Weight Scale", "Keep Fit", "Get Stronger", "Gain Muscle")

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
            findNavController().navigate(R.id.action_preStep2Fragment_to_preStep3Fragment)
        }
    }

    override fun allObserver() {
    }

}