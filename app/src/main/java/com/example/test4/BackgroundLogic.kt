package com.example.test4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_background_logic.*

class BackgroundLogic : AppCompatActivity() {

    var textvalue: String= ""
    var intText: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_background_logic)

        btnbck.setOnClickListener {
            textvalue = txtbck.text.toString()
//            convert the text to int

            intText = Integer.valueOf(textvalue)
//            create a  new object

            val myWork = MyWork()
//            double the value

            val newValue = myWork.doubleTheValue(intText)
            txtbck.text = newValue.toString()
        }


    }
}