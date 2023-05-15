package com.example.materialdesign

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button

class Tela4 : DebugActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela4)
        val button = findViewById<Button>(R.id.button)
        val sair = findViewById<Button>(R.id.SAIR)

        /**Back button*/
        val diplay = supportActionBar
        diplay?.title = "Tela 4"
        diplay?.setDisplayHomeAsUpEnabled(true)

        button.setOnClickListener() {
            val tela1 = Intent(this,Tela1::class.java)
            startActivity(tela1)
        }

        sair.setOnClickListener() {
            val sair1 = Intent(this,MainActivity::class.java)
            startActivity(sair1)
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