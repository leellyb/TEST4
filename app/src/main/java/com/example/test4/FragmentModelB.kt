package com.example.test4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class FragmentModelB : Fragment() {
    lateinit var text2: TextView
lateinit var model2: SharedViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_model_b, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        insance of the shared view modelclass

        model2 = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
//        view referencing
        text2 = view.findViewById(R.id.txtA)
//        using model to observe changes in my mutablelivedata

        model2.message.observe(viewLifecycleOwner, Observer {
            text2.text = it

        })

    }


}