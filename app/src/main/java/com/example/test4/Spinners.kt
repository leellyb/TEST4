package com.example.test4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_spinners.*

class Spinners : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinners)

        val lang = resources.getStringArray(R.array.Language)

        val spin = findViewById<Spinner>(R.id.spinner)

        if (spin != null) {
            val adapter= ArrayAdapter(this,android.R.layout.simple_list_item_1,lang)
            spin.adapter = adapter
            spin.onItemSelectedListener  = object : AdapterView.OnItemSelectedListener{
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    Toast.makeText(this@Spinners,getString(R.string.select_item) + " " +
                    "" + lang[position], Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }


            }


        }
    }
}

