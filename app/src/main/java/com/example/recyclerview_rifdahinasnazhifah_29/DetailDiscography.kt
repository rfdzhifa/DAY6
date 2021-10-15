package com.example.recyclerview_rifdahinasnazhifah_29

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.ImageView
import android.widget.TextView

class DetailDiscography : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_discography)

        supportActionBar?.hide()
        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)

        val detail = intent.getParcelableExtra<DAY6>(Home.INTENT_PARCELABLE)

        val member = findViewById<ImageView>(R.id.imgdiscography)
        val judul = findViewById<TextView>(R.id.detailtitle)

        member.setImageResource(detail?.member!!)
        judul.text = detail.judul
    }
}