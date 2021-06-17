package com.example.test4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fragment_class.*

class FragmentClass : AppCompatActivity(), Communicator{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_class)

        //load up a default fragment so that the view is not empty

        supportFragmentManager.beginTransaction().replace(R.id.fragclass, FragmentA()).commit()

//        setting a switch from one frag to the other frag
//
//        btnfrag.setOnClickListener {
//            supportFragmentManager.beginTransaction().replace(R.id.fragclass, FragmentB()).commit()
//        }
    }

    override fun passdata(text: String) {
        val bundle = Bundle()
        bundle.putString("share", text)
         val transition = this.supportFragmentManager.beginTransaction()
        val fragb = FragmentB()
        fragb.arguments = bundle
        transition.replace(R.id.fragclass, fragb)
        transition.commit()
    }
}