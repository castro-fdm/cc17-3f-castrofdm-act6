package com.example.a30daysapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterClass(private val dataList: ArrayList<DataClass>): RecyclerView.Adapter<AdapterClass.ViewHolderClass>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolderClass(itemView)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
        val currentItem =  dataList[position]
        holder.rvDayText.text = currentItem.dataDate
        holder.rvTitleText.text = currentItem.dataTitle
        holder.rvImage.setImageResource(currentItem.dataImage)
        holder.rvContentText.text = currentItem.dataText

    }

    class ViewHolderClass(itemView: View): RecyclerView.ViewHolder(itemView){
        val rvDayText:TextView = itemView.findViewById(R.id.dayText)
        val rvTitleText:TextView = itemView.findViewById(R.id.titleText)
        val rvImage:ImageView = itemView.findViewById(R.id.cardImage)
        val rvContentText:TextView = itemView.findViewById(R.id.contentText)
    }

}