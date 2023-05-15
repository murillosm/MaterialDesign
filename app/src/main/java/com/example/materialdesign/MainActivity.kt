package com.example.materialdesign

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import com.example.materialdesign.R.id

class MainActivity : DebugActivity(){

    private val TAG = "livro"
    private val context: Context get() = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /*if(savedInstanceState == null){
            supportFragmentManager.beginTransaction()
                .replace(android.support.design.R.id.container, MainFragment.newInstance())
                .commitNow()
        }*/

        //Definindo a Visão
        setContentView(R.layout.activity_main)
        Log.v(TAG, "Visão criada")
        val chBox = findViewById<CheckBox>(id.checkBox)
        val btLogin = findViewById<Button>(id.buttonFazLogin)
        val close = findViewById<ImageButton>(id.btClose)
        val load = findViewById<ProgressBar>(id.progressBar)
        //onClick(R.id.buttonFazLogin){onClickLogin()}

        //Agora os EVENTOS
        btLogin.setOnClickListener() {
            val tLogin = findViewById<TextView>(id.editTextLogin)
            val tSenha = findViewById<TextView>(id.editTextSenha)
            val login = tLogin.text.toString()
            val senha = tSenha.text.toString()
            val imageUser = findViewById<ImageView>(id.imageUser) as ImageView

            imageUser.setOnClickListener(){
                Toast.makeText(this@MainActivity, "You clicked on ImageView.", Toast.LENGTH_SHORT).show()
                if(imageUser.isClickable){
                    toast("Imagem do usuario --> ImageView")
                }
            }
            if (login == "murillo" && senha == "123") {


                //*************************************************************
                if (close.isClickable){
                    load.visibility = ProgressBar.VISIBLE
                }
                if(chBox.isChecked){
                    toast("Bem vindo, login realizado com sucesso, senha foi salva")
                }else{
                    toast("Bem vindo, login realizado com sucesso")
                }
                //abrirCalendario()
                abrirTela1()
                load.visibility = ProgressBar.GONE

            } else {
                if (close.isClickable){
                    load.visibility = ProgressBar.GONE
                }
                toast("Login ou Senha incorretos!!")
            }
        }

        close.setOnClickListener() {
            finish()
            if(close.isClickable){
                toast("Aplicativo encerrado")
            }
        }
    }

    private fun toast(mensagem: String, length: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, mensagem, length).show()
    }

    private fun abrirTela1(){
        val tela1 = Intent(this,Tela1::class.java)
        startActivity(tela1)
    }

}