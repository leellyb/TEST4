package com.example.test4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.textfield.TextInputEditText

class FragmentModelA : Fragment() {
//    tag fro view model class
    lateinit var model: SharedViewModel

// tag for edittext
    lateinit var txtz: TextInputEditText
//    tag for the button
    lateinit var btnshare: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_model_a, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        view referencing
        txtz = view.findViewById(R.id.txtA)
        btnshare = view.findViewById(R.id.btnA)
//        create an instance of the shared viewmodel class

        model = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)

        btnshare.setOnClickListener {
//            captur users input

            val userinput = txtz.text.toString()

            model.sendmessage(userinput)

        }
    }

    }
