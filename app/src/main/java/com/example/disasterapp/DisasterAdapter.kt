package com.example.disasterapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.disasterapp.databinding.ActivityMainBinding
import com.example.disasterapp.databinding.ItemDisasterBinding

class DisasterAdapter(private val listDisaster: List<Disaster>)
    : RecyclerView.Adapter<DisasterAdapter.ItemDisasterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemDisasterViewHolder {
        val binding = ItemDisasterBinding.inflate(LayoutInflater.from(parent.context), parent,false)
        return ItemDisasterViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return listDisaster.size
    }
    override fun onBindViewHolder(holder: ItemDisasterViewHolder, position: Int) {
        holder.bind(listDisaster[position])
    }

    inner class ItemDisasterViewHolder(private val binding: ItemDisasterBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(data: Disaster) {
            with(binding) {
                txtDisasterName.text = data.nameDisaster
                txtDisasterType.text = data.disasterType
            }
        }
    }
}