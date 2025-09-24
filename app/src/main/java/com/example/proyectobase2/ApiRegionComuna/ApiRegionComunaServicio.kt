package com.example.proyectobase2.ApiRegionComuna

import retrofit2.http.GET


data class InsertResponse(
    val success: Boolean,
    val message: String?
)

interface ApiRegionComunaServicio {
    @GET("apiduoc/consulta_comuna.php")
    suspend fun getRegionComuna(): List<RegionComuna>

}