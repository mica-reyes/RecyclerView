package com.example.recyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.SuperHero

class SuperHeroAdapter(private val superheroList: List<SuperHero>) :
    RecyclerView.Adapter<SuperHeroViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_superhero, parent, false)
        return SuperHeroViewHolder(view)
    }

    override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {
        val item = superheroList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = superheroList.size
}