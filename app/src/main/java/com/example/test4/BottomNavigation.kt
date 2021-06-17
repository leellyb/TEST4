package com.example.test4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class BottomNavigation : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation)
        val bottomnav = findViewById<BottomNavigationView>(R.id.bottom_nav)

       bottomnav.setOnNavigationItemSelectedListener(this)


    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.bottomCarFix -> {
                val intentCar = Intent(this@BottomNavigation, ConstraintActivity::class.java)
            }

            R.id.bottomconstraint -> {
                val intentCon = Intent(this@BottomNavigation, CarFix::class.java)
                startActivity(intentCon)

            }
            R.id.bottomlinearlayout -> {
                Toast.makeText(applicationContext, "Linear Clicked", Toast.LENGTH_LONG).show()

            }
        }
        return true
    }


}