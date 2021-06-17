package com.example.test4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_car_fix.*

class CarFix : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_car_fix)

        val rBar = findViewById<RatingBar>(R.id.ratingBar)

            val sign = findViewById<Button>(R.id.button2)
        button2?.setOnClickListener {
            val msg = rBar.rating.toString()
            Toast.makeText(this@CarFix, "Rating is: " +msg,Toast.LENGTH_SHORT).show()
        }
        }


    }

