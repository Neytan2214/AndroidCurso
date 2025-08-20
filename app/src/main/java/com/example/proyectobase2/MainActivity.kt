package com.example.proyectobase2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // declaramos  variables con los elementos layout
        val edUsername:EditText = findViewById(R.id.ed_username)
        val edPasswd:EditText = findViewById(R.id.ed_passwd)
        val btnLogin:Button = findViewById(R.id.btn_login)
        val helloWorld:TextView = findViewById(R.id.tx_menesaje)

        //Agregamos variables default
        var defaultUsr = "ney.silva@duocuc.cl"
        var defaultPasswd = "admin123"

        //Accion sobre el boton
        btnLogin.setOnClickListener {
            if (edUsername.text.toString() == defaultUsr &&
                edPasswd.text.toString() == defaultPasswd){

                helloWorld.text="Bienvenidos"

                val nuevaVentana = Intent(this, MainActivity2::class.java)
                nuevaVentana.putExtra("pUsuario", edUsername.text.toString())
                startActivity(nuevaVentana)

            }else{
                helloWorld.text="Error! Usuario/Password Incorrecto"
            }
        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}