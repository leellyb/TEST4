package com.example.test4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class FragmentB : Fragment() {
    lateinit var txts: TextView
    var sharedtext:String = ""


    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_b, container, false)

        txts = view.findViewById(R.id.textView6)
        sharedtext = arguments?.getString("share").toString()
        txts.text = sharedtext
        return view

    }

}
