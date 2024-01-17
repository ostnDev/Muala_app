package com.example.muala.presentation

import com.google.maps.android.compose.MapProperties

data class MapState(
    val properties: MapProperties = MapProperties(isMyLocationEnabled = true)
)
