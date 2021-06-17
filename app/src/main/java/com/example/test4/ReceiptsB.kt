package com.example.test4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_intent_sharing_b.*
import kotlinx.android.synthetic.main.activity_receipts.*
import kotlinx.android.synthetic.main.activity_receipts_b.*

class ReceiptsB : AppCompatActivity() {

var breadprice: Int=0
    var milkprice: Int=0
    var saniprice:Int=0
    var jellyprice: Int=0

    var totalprice: Int=0

    var price: String =""
    var price2: String =""
    var price3: String =""
    var price4: String =""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receipts_b)



        val bundle: Bundle? = intent.extras
//      share image
        val d: Int = bundle!!.getInt("B ")
        val e: Int = bundle!!.getInt("M ")
        val f: Int = bundle!!.getInt("S ")
        val g: Int = bundle!!.getInt("J ")


//      select image
        breadB.setImageResource(d)
        milkB.setImageResource(e)
        saniB.setImageResource(f)
        jeloB.setImageResource(g)
//      share text
//


       price=intent.getStringExtra("Bread").toString()
        price2=intent.getStringExtra("Milk").toString()
        price3 =intent.getStringExtra("Sanitizer").toString()
        price4=intent.getStringExtra("Jelly").toString()




        add()
//     select text
            pricebrB.append("${price}/=")
            pricemB.append("${price2}/=")
            pricesaniB.append("${price3}/=")
            pricejB.append("${price4}/=")
            textView4.text=totalprice.toString()





            bckrec.setOnClickListener {
                val intentbck = Intent(this@ReceiptsB, Receipts::class.java)
                startActivity(intentbck)




        }
    }

    private fun add() {
        breadprice=price.toInt()
        milkprice=price2.toInt()
        saniprice=price3.toInt()
        jellyprice=price4.toInt()
        totalprice=breadprice+milkprice+saniprice+jellyprice
        Log.d("main","details " + totalprice.toString())
    }


}