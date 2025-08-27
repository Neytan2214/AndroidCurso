package com.example.proyectobase2

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.proyectobase2.utlis.OpMatematicas;

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)
        val edNumero1:EditText=findViewById(R.id.edNumero1)
        val edNumero2:EditText=findViewById(R.id.edNumero2)
        val btnCalcular:Button=findViewById(R.id.btnCalcular)
        val txResultado:TextView=findViewById(R.id.txResultado)
        val spOperaciones:Spinner=findViewById(R.id.sp_operaciones)
        val menuSPoperaciones= listOf("Sumar","Restar","Multiplicar","Dividir")
        val adapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,menuSPoperaciones)
        spOperaciones.adapter=adapter

        btnCalcular.setOnClickListener {
            var calcN1:Int=edNumero1.text.toString().toIntOrNull()?:0
            var calcN2:Int=edNumero2.text.toString().toIntOrNull()?:0
            var resultadoOP:Int=OpMatematicas.sumar(calcN1,calcN2)
            txResultado.text=resultadoOP.toString()


        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}