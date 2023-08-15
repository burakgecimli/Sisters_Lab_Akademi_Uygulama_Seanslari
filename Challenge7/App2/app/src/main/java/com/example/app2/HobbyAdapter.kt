package com.example.app2

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.app2.databinding.CardDesignBinding

class HobbyAdapter(val mContext: Context, val hobbyList: ArrayList<HobbyModel>) :
    RecyclerView.Adapter<HobbyAdapter.CardDesign>() {

    class CardDesign(val binding: CardDesignBinding) : ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesign {
        val layoutInflater = LayoutInflater.from(mContext)
        val binding = CardDesignBinding.inflate(layoutInflater, parent, false)

        return CardDesign(binding)
    }

    override fun getItemCount() = hobbyList.size


    override fun onBindViewHolder(holder: CardDesign, position: Int) {
        val hobby = hobbyList[position]
        holder.binding.textViewHobby.text = hobby.hobbyName
        holder.binding.imageViewHobby.setImageResource(hobby.hobyImage)
    }

}