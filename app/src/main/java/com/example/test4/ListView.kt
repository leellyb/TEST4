package com.example.test4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ListView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val arrayadapter: ArrayAdapter<*>
        val num = arrayOf(
            "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"
        )
        val list = findViewById<ListView>(R.id.listview)
       arrayadapter = ArrayAdapter(this , android.R.layout.simple_list_item_1,num)
        list.adapter=arrayadapter
    }


    }

