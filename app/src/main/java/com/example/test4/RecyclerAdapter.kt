package com.example.test4

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.custom_item.view.*

class RecyclerAdapter(private val context: Context, private val itemlist: List<RecyclerModel>) :
  RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>(){
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerAdapter.RecyclerViewHolder {
       val infater = LayoutInflater.from(parent.context).inflate(
           R.layout.custom_item,parent, false
       )
        return RecyclerViewHolder(infater)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.RecyclerViewHolder, position: Int) {
//    create a var that will ref the item position

        var items = itemlist[position]

//        set data

        holder.imageView.setImageResource(items.studentImage)
        holder.textname.text = items.studentName
        holder.textage.text = items.studentAge
        holder.textadm.text = items.studentAdm
    }

    override fun getItemCount() = itemlist.size

//    declare view holder
    class RecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
//        declaring variables to reference the views in my recycle item

        val imageView: ImageView = itemView.img
        val textname: TextView = itemView.name
        val textage: TextView = itemView.age
        val textadm: TextView = itemView.adm

    }
}