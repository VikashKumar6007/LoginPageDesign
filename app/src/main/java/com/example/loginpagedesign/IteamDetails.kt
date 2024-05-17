package com.example.loginpagedesign

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ItemDetails(private val ItemList:ArrayList<Details>) :RecyclerView.Adapter<ItemDetails.ItemViewHolder>() {

    class ItemViewHolder(itemView : View):RecyclerView.ViewHolder(itemView){
        val imageView : ImageView= itemView.findViewById(R.id.c1)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.activity_home , parent, false)
        return ItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return ItemList.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
    val details = ItemList[position]
        holder.imageView.setImageResource(details.image)

    }
}