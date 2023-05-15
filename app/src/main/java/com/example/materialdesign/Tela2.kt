package com.example.materialdesign

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button

class Tela2 : DebugActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)
        val button = findViewById<Button>(R.id.button)

        /**Back button*/
        val diplay = supportActionBar
        diplay?.title = "Tela 2"
        diplay?.setDisplayHomeAsUpEnabled(true)

        button.setOnClickListener() {
            val tela3 = Intent(this, Tela3::class.java)
            startActivity(tela3)
        }

    }
    /**clicking back*/
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            android.R.id.home ->{
                finish()
                true
            }
            else ->super.onOptionsItemSelected(item)
        }
    }

}