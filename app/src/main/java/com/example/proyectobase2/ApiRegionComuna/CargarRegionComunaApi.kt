package com.example.proyectobase2.ApiRegionComuna

import android.widget.Spinner
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch

object CargarRegionComunaApi {

    /** Carga alumnos del API y los pinta en el ListView indicado. */
    fun cargarregionComuna(owner: LifecycleOwner, spinner: Spinner) {
        owner.lifecycleScope.launch {
            val res = RegionComunaRepository.fetchRegionComuna()

            res.onSuccess { regionComuna ->
                if (regionComuna.isEmpty()) {
                    Toast.makeText(
                        spinner.context,
                        "Sin datos desde el servicio",
                        Toast.LENGTH_SHORT
                    ).show()
                }

                val datos = regionComuna.map { a ->
                    //"NOMBRE  : ${a.nombre}\n" +
                    "${a.region}\n"

                    //"SECCIÓN : ${a.seccion}"
                }

                spinner.adapter = ArrayAdapter(
                    spinner.context,
                    android.R.layout.simple_list_item_1,
                    datos
                )

                android.util.Log.d("ws_region_Comuna", "items=${regionComuna.size}")
            }.onFailure { e ->
                android.util.Log.e("ws_region_Comuna", "falló", e)
                Toast.makeText(
                    spinner.context,
                    "Error al cargar: ${e.message}",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }

    /** Carga region comuna del API y los pinta en el spinner indicado. */
    fun cargarRegionComuna2(owner: LifecycleOwner, spinner: Spinner) {
        owner.lifecycleScope.launch {
            val res = RegionComunaRepository.fetchRegionComuna()

            res.onSuccess { regionComuna ->
                if (regionComuna.isEmpty()) {
                    Toast.makeText(
                        spinner.context,
                        "Sin datos desde el servicio",
                        Toast.LENGTH_SHORT
                    ).show()
                }


                val datos = regionComuna.map { a ->
                    //"NOMBRE  : ${a.id}\n" +
                    "${a.comuna}\n"
                    // "SECCIÓN : ${a.region}"
                }


                spinner.adapter = ArrayAdapter(
                    spinner.context,
                    android.R.layout.simple_list_item_1,
                    datos
                )

                android.util.Log.d("ws_region_comuna", "items=${regionComuna.size}")

            }.onFailure { e ->
                android.util.Log.e("ws_region_comuna", "falló", e)
                Toast.makeText(
                    spinner.context,
                    "Error al cargar: ${e.message}",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }

}