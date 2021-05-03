package com.example.meuprimeiroape

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TelaPrincipalActivity : AppCompatActivity() {

        lateinit var buttonTelaPrincipal: Button

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_principal)

        buttonTelaPrincipal = findViewById<Button>(R.id.buttonPrincipal)

            buttonTelaPrincipal.setOnClickListener {
                val mudarTela = Intent(this, TelaLoginActivity::class.java)
                startActivity(mudarTela)
            }


    }
}