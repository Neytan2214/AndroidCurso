package com.example.proyectobase2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main6)
        val etNombre:EditText=findViewById(R.id.etNombre)
        val etApellido:EditText=findViewById(R.id.etApellido)
        val spGrupo:Spinner=findViewById(R.id.spGrupo)
        val spSeccion:Spinner=findViewById(R.id.spSeccion)
        val btnGuardar:Button=findViewById(R.id.btnGuardar)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}