package com.example.test4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_auto_text_view.*

class AutoTextView : AppCompatActivity() {
  private  var progressbar: ProgressBar? = null
  private var a = 0
  private var txtview: TextView? = null
    var handler = Handler()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auto_text_view)
         progressbar = findViewById<ProgressBar>(R.id.progressb) as ProgressBar
        txtview = findViewById(R.id.tview) as TextView
        val btn = findViewById(R.id.btnprogress) as Button

//        btnprogress.setOnClickListener {
//            a = progressbar!!.progress Thread(Runnable {
//                while(a<100){
//                    a +=5
//
//                    handler.post(Runnable {
//                         progressbar!!.progress = a
//                        txtview!!.text = a.toString() + "/" + progressbar!!.max
//                    })
//                    try {
//                        Thread.sleep(100)
//                    }catch (e:InterruptedException){
//                        e.printStackTrace()
//                    }
//                }
//            }).start()
//        }



        val autoTextView = findViewById<AutoCompleteTextView>(R.id.autoview)

        val motors = resources.getStringArray(R.array.machines)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,motors)
        autoTextView.setAdapter(adapter)

        val button = findViewById<Button>(R.id.btn)
        if (button !=null){
            button ?.setOnClickListener(View.OnClickListener {
                val enteredText = getString(R.string.sub) + " " +
                Toast.makeText(applicationContext, "Button Clicked", Toast.LENGTH_SHORT).show()
            })

            }
        }

    }



