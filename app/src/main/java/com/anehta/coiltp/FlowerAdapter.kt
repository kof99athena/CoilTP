package com.anehta.coiltp

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.Coil
import coil.load
import com.anehta.coiltp.databinding.RecyclerviewItemBinding

class FlowerAdapter : ListAdapter<FlowerData, FlowerAdapter.ViewHolder>(FlowerDiffCallback) {

    class ViewHolder(private val binding: RecyclerviewItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(imagUrl: String) {
            binding.imgFlower.load(imagUrl)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            RecyclerviewItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentFlower = getItem(position)
        holder.bind(currentFlower.imgUrl)
    }
}