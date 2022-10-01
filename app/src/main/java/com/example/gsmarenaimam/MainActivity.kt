package com.example.gsmarenaimam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvAcademy: RecyclerView
    private var list: ArrayList<Gadget> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionbar = supportActionBar
        actionbar!!.title= "GSMArena by ImamAF"

        rvAcademy = findViewById(R.id.rv_academy)
        rvAcademy.setHasFixedSize(true)

        list.addAll(GadgetData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvAcademy.layoutManager = LinearLayoutManager(this)
        val academyAdapter = ListGadgetAdapter(list)
        rvAcademy.adapter = academyAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.about_page -> {
                val iAbout = Intent(this@MainActivity, AboutPage::class.java)
                startActivity(iAbout)
            }
        }
    }
}