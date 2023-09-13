package com.example.recyclerviewkt

import android.icu.text.CaseMap.Title
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterClass (private val datalist : ArrayList<DataClass>):RecyclerView.Adapter<AdapterClass.ViewHolderClass>() {

    class ViewHolderClass (itemView: View):
            RecyclerView.ViewHolder(itemView){

                val rvImage : ImageView = itemView.findViewById(R.id.image_View)

                val rvTitle : TextView = itemView.findViewById(R.id.text_View)


            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return ViewHolderClass(itemView)
    }

    override fun getItemCount(): Int {
        return datalist.size
    }

    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
        val currentItem = datalist[position]
        holder.rvImage.setImageResource(currentItem.dataImage)
        holder.rvTitle.text = currentItem.dataTitle
    }
}