package com.example.fitoozone.view.preSteps

import android.widget.AdapterView
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import com.example.fitoozone.R
import com.example.fitoozone.adapter.ListAdapter2
import com.example.fitoozone.base.BaseFragment
import com.example.fitoozone.data.ListData2
import com.example.fitoozone.databinding.FragmentPreStep7Binding

class PreStep7Fragment : BaseFragment<FragmentPreStep7Binding>(FragmentPreStep7Binding::inflate) {
    private lateinit var listAdapter: ListAdapter2
    private lateinit var listData: ListData2
    var dataArrayList = ArrayList<ListData2?>()

    val listTitle = arrayOf("Beginner", "Irregular training", "Medium", "Advanced")
    val listDetail = arrayOf(
        "I want to start training",
        "I train 1-2 times a week",
        "I train 3-5 times a week",
        "I train more than 5 times a week"
    )
    override fun setListener() {
        dataArrayList.clear()
        for (i in listTitle.indices) {
            listData = ListData2(
                listTitle[i],
                listDetail[i]
            )
            dataArrayList.add(listData)
        }

        listAdapter = ListAdapter2(requireContext(), dataArrayList)
        binding.listview.adapter = listAdapter
        binding.listview.isClickable = true
        binding.listview.itemsCanFocus = true

        binding.listview.onItemClickListener =
            AdapterView.OnItemClickListener { _, view, i, _ ->
                view.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.lavender))
            }

        binding.btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_preStep7Fragment_to_preStep8Fragment)
        }
    }

    override fun allObserver() {
    }

}