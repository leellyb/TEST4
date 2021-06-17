package com.example.test4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_navigation_drawer.*

class          NavigationDrawer : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
   //initializing tags for widgets

   private lateinit var drawer: DrawerLayout
   private lateinit var toolbar: Toolbar
   private lateinit var navView:NavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_drawer)

//        view identity
        drawer = findViewById(R.id.drawer_layout)
        toolbar = findViewById(R.id.tb)
        setSupportActionBar(toolbar)
        navView = findViewById(R.id.nav_drawer)

//        a listener for the nav
        navView.setNavigationItemSelectedListener(this)

        val toggle: ActionBarDrawerToggle = ActionBarDrawerToggle(this,drawer,toolbar,
        R.string.navigation_drawer_open,R.string.navigation_drawer_close)

//        attach drawer layout to listen to the toggle

        drawer.addDrawerListener(toggle)
        toggle.syncState()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.nav_constraint -> {
                val intentCon = Intent(this@NavigationDrawer,ConstraintActivity::class.java)
                startActivity(intentCon)
            }
            R.id.nav_CarFix ->{
                val intentCar = Intent(this@NavigationDrawer,CarFix::class.java)
                startActivity(intentCar)

            }
            R.id.nav_linearlayout -> {
                Toast.makeText(applicationContext, "Linear Clicked", Toast.LENGTH_LONG).show()

            }
            R.id.nav_recycle ->{
                val intentrecycle = Intent(this@NavigationDrawer,RecyclerView::class.java)
                startActivity(intentrecycle)

            }
//            R.id.nav_recycle -> {
//                Toast.makeText(applicationContext, " Recycler Clicked", Toast.LENGTH_LONG).show()
//
//            }
            R.id.nav_auto ->{
                val intentauto = Intent(this@NavigationDrawer,AutoTextView::class.java)
                startActivity(intentauto)

            }
            R.id.nav_radio ->{
                val intentradio = Intent(this@NavigationDrawer,RadioButtons::class.java)
                startActivity(intentradio)

            }
            R.id.nav_scroll ->{
                val intentscroll = Intent(this@NavigationDrawer,HorizontalScroll::class.java)
                startActivity(intentscroll)

            }
            R.id.nav_table ->{
                val intenttable = Intent(this@NavigationDrawer,TableLayouts::class.java)
                startActivity(intenttable)

            }
            R.id.nav_intent ->{
                val intentI = Intent(this@NavigationDrawer,IntentSharing::class.java)
                startActivity(intentI)

            }
            R.id.nav_receipts ->{
                val intentreceipts = Intent(this@NavigationDrawer,Receipts::class.java)
                startActivity(intentreceipts)

            }
            R.id.nav_fragment ->{
                val intentfragment = Intent(this@NavigationDrawer,FragmentClass::class.java)
                startActivity(intentfragment)

            }
            R.id.nav_spin ->{
                val intentspin = Intent(this@NavigationDrawer,Spinners::class.java)
                startActivity(intentspin)

            }
            R.id.nav_view ->{
                val intentview = Intent(this@NavigationDrawer,ListView::class.java)
                startActivity(intentview)

            }
            R.id.nav_fragmentmodel ->{
                val intentfragmodel = Intent(this@NavigationDrawer,FragmentViewModel::class.java)
                startActivity(intentfragmodel)

            }


        }


        return true
    }




    override fun onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START)
        }else {
            super.onBackPressed()
        }

    }



}