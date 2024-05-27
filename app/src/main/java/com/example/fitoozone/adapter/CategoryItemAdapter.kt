package com.example.fitoozone.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.fitoozone.data.ListData
import com.example.fitoozone.databinding.ItemCategoryBinding

class CategoryItemAdapter(private var list: List<ListData>): RecyclerView.Adapter<CategoryItemAdapter.CategoryViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val binding =  ItemCategoryBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return CategoryViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        list[position].let {
            holder.binding.apply {
                ivItemIcon.load(it.image)
                tvItemTitle.text = it.name
            }
        }
    }

    inner class CategoryViewHolder(val binding: ItemCategoryBinding): RecyclerView.ViewHolder(binding.root)
}

