package com.example.proyectobase2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        val txtNombre:EditText=findViewById(R.id.txtNombre)
        val txtTelefono:EditText=findViewById(R.id.txtTelefono)
        val txtFecha:EditText=findViewById(R.id.txtFecha)
        val btnRegistrarse:Button=findViewById(R.id.btnRegistrarse)

        btnRegistrarse.setOnClickListener {
            val text="Registrado"
            val duration=Toast.LENGTH_SHORT
            val toast=Toast.makeText(this,text,duration)
            toast.show()

        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}