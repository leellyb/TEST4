package com.example.test4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

//        setting the list items for my recyclerview

        val listRecycle = generateStaticList()
//   connect the widget to te adapter
        recyclerview.adapter = RecyclerAdapter(this, listRecycle)
//       setting layout for recycled item
        recyclerview.layoutManager = LinearLayoutManager(this)
//        state that the recyclerview has a fixed item size
        recyclerview.setHasFixedSize(true)

    }
    private fun generateStaticList() : List<RecyclerModel>{
//        arraylist to add data
        val listitems = ArrayList<RecyclerModel>()
//        add the data model
        listitems.add(
            RecyclerModel(
            R.drawable.ic_baseline_deck_24,
            studentName = "lilly",
            studentAge = "20",
                studentAdm = "2004"

        ))
        listitems.add(
            RecyclerModel(
                R.drawable.ic_baseline_directions_car_24,
                studentName = "milly",
                studentAge = "21",
                studentAdm = "2005"

            ))
        listitems.add(
            RecyclerModel(
                R.drawable.ic_baseline_drag_indicator_24,
                studentName = "billy",
                studentAge = "22",
                studentAdm = "2006"

            ))
//        return listitems
        return listitems
    }
}