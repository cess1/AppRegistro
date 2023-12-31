package com.example.apprestaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class PantallaPrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_principal)

        val btnAcceder = findViewById<Button>(R.id.btnAcceder);
        val btnSalir: Button = findViewById(R.id.btnSalir);

        btnAcceder.setOnClickListener{
            val productScreen = Intent(this, BienvenidaActivity::class.java)
            startActivity(productScreen)
        };

        btnSalir.setOnClickListener {
            Toast.makeText(this, "El usuario esta intentando cancelar el registro", Toast.LENGTH_LONG).show();
        }

    }
}