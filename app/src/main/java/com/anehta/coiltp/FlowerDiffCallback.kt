package com.anehta.coiltp

import androidx.recyclerview.widget.DiffUtil

object FlowerDiffCallback : DiffUtil.ItemCallback<FlowerData>() {
    override fun areItemsTheSame(oldItem: FlowerData, newItem: FlowerData): Boolean {
        return oldItem.imgUrl == newItem.imgUrl
    } // 참조변수가 변경되었는지 결과를 Boolean으로 비교한다.

    override fun areContentsTheSame(oldItem: FlowerData, newItem: FlowerData): Boolean {
        return oldItem == newItem
    } // 내용이 변경된건지 결과를 Boolean으로 비교한다.
}