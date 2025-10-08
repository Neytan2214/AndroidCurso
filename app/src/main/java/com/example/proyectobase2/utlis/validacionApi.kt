package com.example.proyectobase2.utlis

import android.widget.EditText
import com.example.proyectobase2.R

object validacionApi {
    // La función ahora recibe los EditText como parámetros
    fun validarYLimpiarCampos(etNombre: EditText, etApellido: EditText):Boolean {

        var esValido = true

        // Limpiar y validar el nombre
        val nombre = etNombre.text.toString().trim()
        if (nombre.isEmpty()) {
            etNombre.error = "El nombre es obligatorio"
            esValido = false
        } else {
            etNombre.setText(nombre)

            // Limpiar y validar el apellido
            val apellido = etApellido.text.toString().trim()
            if (apellido.isEmpty()) {
                etApellido.error = "El apellido es obligatorio"
                esValido = false
            } else {
                etApellido.setText(apellido)
            }


        }
        return esValido
    }
}