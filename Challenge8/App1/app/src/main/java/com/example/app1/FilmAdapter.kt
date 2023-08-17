package com.example.app1

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.app1.databinding.CardViewBinding

class FilmAdapter(private val mContext: Context, private val filmList: ArrayList<FilmModel>) :
    RecyclerView.Adapter<FilmAdapter.CardDesign>() {

    class CardDesign(val binding: CardViewBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesign {
        val layoutInflater = LayoutInflater.from(mContext)
        val binding = CardViewBinding.inflate(layoutInflater, parent, false)
        return CardDesign(binding)
    }

    override fun getItemCount() = filmList.size


    override fun onBindViewHolder(holder: CardDesign, position: Int) {
        val film = filmList[position]
        holder.binding.textViewFilmName.text = film.filmName
        holder.binding.textViewFilmDirector.text = film.filmDirector
        holder.binding.textViewFilmScore.text = film.filmScore

    }


}