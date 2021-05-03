 package com.example.meuprimeiroape

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TelaLoginActivity : AppCompatActivity() {

    lateinit var buttonTelaLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_login)

        buttonTelaLogin = findViewById<Button>(R.id.buttonEntrar)

        buttonTelaLogin.setOnClickListener {
            val mudarTelaEntrar = Intent(this, TelaEscolhaActivity::class.java)
            startActivity(mudarTelaEntrar)
        }
    }
}