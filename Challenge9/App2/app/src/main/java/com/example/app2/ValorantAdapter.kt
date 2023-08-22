package com.example.app2

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.app2.databinding.CardviewDesignBinding

class ValorantAdapter(
    private val mContext: Context,
    private val valorantList: ArrayList<ValorantModel>
) : RecyclerView.Adapter<ValorantAdapter.CardviewHolder>() {


    class CardviewHolder(val binding: CardviewDesignBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardviewHolder {
        val layoutInflater = LayoutInflater.from(mContext)
        val binding = CardviewDesignBinding.inflate(layoutInflater, parent, false)
        return CardviewHolder(binding)

    }

    override fun getItemCount() = valorantList.size


    override fun onBindViewHolder(holder: CardviewHolder, position: Int) {
        val valorant = valorantList[position]
        holder.binding.textviewName.text = valorant.nameCharacter
        holder.binding.imageView.setImageResource(valorant.imageCharacter)

        holder.itemView.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToDetailFragment(valorant)
            holder.itemView.findNavController().navigate(action)

        }


    }


}