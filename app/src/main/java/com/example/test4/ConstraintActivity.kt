package com.example.test4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_relative_layout.*

class ConstraintActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint)


        button2.setOnClickListener {
            val intent= Intent(this@ConstraintActivity,CarFix::class.java)
            startActivity(intent)
        }
    }
}