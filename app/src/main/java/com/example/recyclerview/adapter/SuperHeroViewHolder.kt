package com.example.recyclerview.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerview.SuperHero
import com.example.recyclerview.databinding.ItemSuperheroBinding


class SuperHeroViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val binding = ItemSuperheroBinding.bind(view)

    fun render(superHeroModel: SuperHero) {
        binding.tvSuperHeroName.text = superHeroModel.superHero
        binding.tvPublisher.text = superHeroModel.publisher
        binding.tvRealName.text = superHeroModel.realName

        Glide.with(binding.ivSuperHero.context).load(superHeroModel.photo).into(binding.ivSuperHero)

        itemView.setOnClickListener {
            Toast.makeText(
                binding.ivSuperHero.context,
                superHeroModel.realName,
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}