package com.example.proyectobase2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        val mensajeBienvenida:TextView = findViewById(R.id.Bienvenido)
        val usuarioDesdeOtroActivity=intent.getStringExtra("pUsuario")
        val btnCambiarActivity:Button=findViewById(R.id.btnCambiarActivity)
        val btnCambiarActivity2:Button=findViewById(R.id.btnCambiarActivity2)
        val btnCambiarActivity5:Button=findViewById(R.id.btn_CambiarActivity5)
        val btnCambiarActivity6:Button=findViewById(R.id.btn_CambiarActivity6)
        mensajeBienvenida.text = usuarioDesdeOtroActivity.toString()
        btnCambiarActivity.setOnClickListener {
            val accionCambiarVentana=Intent(this,MainActivity3::class.java)
            startActivity(accionCambiarVentana)
        }
        btnCambiarActivity2.setOnClickListener {
            val accionIrCalculadora=Intent(this,MainActivity4::class.java)
            startActivity(accionIrCalculadora)
        }
        btnCambiarActivity5.setOnClickListener {
            val accionIrActivity5=Intent(this,MainActivity5::class.java)
            startActivity(accionIrActivity5)
        }
        btnCambiarActivity6.setOnClickListener {
            val accionIrAcyivity6=Intent(this,MainActivity6::class.java)
            startActivity(accionIrAcyivity6)
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets



        }
    }
}