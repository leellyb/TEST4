package com.example.test4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_relative_layout.*

class RelativeLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative_layout)

        button2.setOnClickListener {
            val intent  = Intent(applicationContext,NavigationDrawer::class.java)
            startActivity(intent)
        }

    }
}