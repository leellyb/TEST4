package com.example.test4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.google.android.material.textfield.TextInputEditText


class FragmentA : Fragment() {
    lateinit var communicator: Communicator

    lateinit var editText: TextInputEditText
    lateinit var btn: Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_a, container, false)

        editText = view.findViewById(R.id.txt)
        btn = view.findViewById(R.id.button)

        communicator = activity as Communicator

        btn.setOnClickListener {
            communicator.passdata(editText.text.toString())


        }
        return view
    }


}