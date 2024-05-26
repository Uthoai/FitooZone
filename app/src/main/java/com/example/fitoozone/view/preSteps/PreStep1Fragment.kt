package com.example.fitoozone.view.preSteps

import android.widget.AdapterView
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import com.example.fitoozone.R
import com.example.fitoozone.base.BaseFragment
import com.example.fitoozone.adapter.ListAdapter
import com.example.fitoozone.data.ListData
import com.example.fitoozone.databinding.FragmentPreStep1Binding
class PreStep1Fragment : BaseFragment<FragmentPreStep1Binding>(FragmentPreStep1Binding::inflate) {

    private lateinit var listAdapter: ListAdapter
    private lateinit var listData: ListData
    var dataArrayList = ArrayList<ListData?>()

    val imageList = intArrayOf(
        R.drawable.ic_man,
        R.drawable.ic_woman,
        R.drawable.ic_neutral,
    )
    val nameList = arrayOf("Man", "Woman", "Gender Neutral")
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
            findNavController().navigate(R.id.action_preStep1Fragment_to_preStep2Fragment)
        }
    }

    override fun allObserver() {
    }

}



