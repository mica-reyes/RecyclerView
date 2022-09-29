package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.adapter.SuperHeroAdapter
import com.example.recyclerview.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        binding.recyclerSuperHero.layoutManager = LinearLayoutManager(this)
        binding.recyclerSuperHero.adapter = SuperHeroAdapter(SuperHeroProvider.superHeroList)
    }

}