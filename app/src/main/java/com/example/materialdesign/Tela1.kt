package com.example.materialdesign

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button

class Tela1 : DebugActivity(){
    private val TAG = "livro"
    private val context: Context get() = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela1)
        val button = findViewById<Button>(R.id.button)

        /**Back button*/
        val diplay = supportActionBar
        diplay?.title = "Tela 1"
        diplay?.setDisplayHomeAsUpEnabled(true)

        button.setOnClickListener() {
            val tela2 = Intent(this, Tela2::class.java)
            startActivity(tela2)
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