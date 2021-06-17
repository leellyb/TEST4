package com.example.test4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intent_sharing.*
import kotlinx.android.synthetic.main.activity_intent_sharing_b.*

class IntentSharingB : AppCompatActivity() {
    var digit:Int = 0
    var sum: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_sharing_b)

//        pick an image shared
        val bundle: Bundle? = intent.extras
//        create a ref for the new image type
        val imagePicked: Int = bundle!!.getInt("logo")
//        set the image to our view
        applogoB.setImageResource(imagePicked)
//        pick text
        val sharedtext: String? = intent.getStringExtra("edittextdata")
        val sharedtext2: String? = intent.getStringExtra("newdata")
        val sharedtext3: String? = intent.getStringExtra("digit")
//        type conversion
        digit = Integer.valueOf(sharedtext3)

        add()

//      set text container
        textView2.append("value of the edit text "+ sharedtext +
        " value fro  the created tag "+ sharedtext2 + " sum is "+ sum.toString())
    }
    fun add(){
        digit+digit
    }
}