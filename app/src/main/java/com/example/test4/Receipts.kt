package com.example.test4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_receipts.*

class Receipts : AppCompatActivity() {
        var a: String = ""
        var c: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receipts)

//        on click listener
        btnrec.setOnClickListener {
           var b = priceb.text.toString()
           var m = pricem.text.toString()
           var s = pricesani.text.toString()
           var j = pricej.text.toString()
//            start activity
            val receipt = Intent(this@Receipts,ReceiptsB::class.java)

            receipt.putExtra("Bread",b)
            receipt.putExtra("Milk", m)
            receipt.putExtra("Sanitizer", s)
            receipt.putExtra("Jelly", j)
            receipt.putExtra("Total", c)

            receipt.putExtra("B ",R.drawable.bread)
            receipt.putExtra("M ",R.drawable.milk)
            receipt.putExtra("S ",R.drawable.sanitizer)
            receipt.putExtra("J ",R.drawable.jelly)
            startActivity(receipt)
        }
    }
}