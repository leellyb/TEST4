package com.example.test4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intent_sharing.*

class IntentSharing : AppCompatActivity() {

//    declare a variable
    var textsample1: String = ""
    var textedit: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_sharing)

//        click listener
        btnint.setOnClickListener {
            textedit = editint.text.toString()
//1st use case of intent, start an activity
            val intentSharing = Intent(this@IntentSharing,IntentSharingB::class.java)
//            intent to share text
            intentSharing.putExtra("edittextdata", textedit)
            intentSharing.putExtra("newdata", "this is a new data")
            intentSharing.putExtra("digit", "10")
//            intent to share image
            intentSharing.putExtra("logo", R.drawable.ic_baseline_radio_button_checked_24)
            startActivity(intentSharing)
        }
    }
}