package com.example.audioplayer

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListAdapter (val context:Context,val items:Array<String>):RecyclerView.Adapter<ListAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.activity_musiclist,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items.get(position)
        holder.musicTitle.text = item
        holder.musicArtist.text = position.toString()
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val thumbIcon = view.findViewById<ImageView>(R.id.thumbIcon)
        val musicTitle = view.findViewById<TextView>(R.id.musicTitle)
        val musicArtist = view.findViewById<TextView>(R.id.musicArtist)
        val playPause = view.findViewById<ImageView>(R.id.playPause)

    }
}