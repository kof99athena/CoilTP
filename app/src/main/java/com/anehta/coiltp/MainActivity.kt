package com.anehta.coiltp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.anehta.coiltp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val adapter: FlowerAdapter by lazy { FlowerAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val flowerList = ArrayList<FlowerData>()
        flowerList.add(FlowerData("https://cdn.pixabay.com/photo/2017/09/28/17/09/cherry-blossom-2796230_1280.jpg"))
        flowerList.add(FlowerData("https://cdn.pixabay.com/photo/2020/04/12/07/16/sakura-5033075_1280.jpg"))
        flowerList.add(FlowerData("https://cdn.pixabay.com/photo/2018/04/06/01/40/wood-3294754_1280.jpg"))
        flowerList.add(FlowerData("https://cdn.pixabay.com/photo/2020/04/12/07/41/sakura-5033142_1280.jpg"))

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter

        adapter.submitList(flowerList)
    }
}