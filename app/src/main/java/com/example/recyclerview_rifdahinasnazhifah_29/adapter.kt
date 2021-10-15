package com.example.recyclerview_rifdahinasnazhifah_29

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Switch
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class adapter (private val context: Context, private val day6: List<DAY6>, val listener: (DAY6) -> Unit)
    :RecyclerView.Adapter<adapter.ViewHolderTask>() {
    class ViewHolderTask (view: View): RecyclerView.ViewHolder (view) {

        val Image = view.findViewById<ImageView>(R.id.img_member)
        val Judul = view.findViewById<TextView>(R.id.judul)
        val Date = view.findViewById<TextView>(R.id.date)

        fun bindView(day6: DAY6, listener: (DAY6) -> Unit) {
            Image.setImageResource(day6.member)
            Judul.text = day6.judul
            Date.text = day6.date
            itemView.setOnClickListener{listener(day6)}
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderTask {
        return ViewHolderTask(
            LayoutInflater.from(context).inflate(R.layout.member_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolderTask, position: Int) {
        holder.bindView(day6[position], listener)
    }

    override fun getItemCount(): Int = day6.size
    }

    private fun Switch.setSwitchTypeface(switchButton: Int) {

    }
