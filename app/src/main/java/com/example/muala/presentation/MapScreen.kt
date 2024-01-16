package com.example.muala.presentation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.rememberCameraPositionState

@Composable
fun MapScreenWithMarker() {
    // change color of the marker
    // implement onClick with popup composable

    val philipineSea = LatLng(20.302039, 134.2082661)
    val cameraPositionState = rememberCameraPositionState {
        position = CameraPosition.fromLatLngZoom(philipineSea, 2f)
    }
    GoogleMap(
        modifier = Modifier.fillMaxSize(),
        cameraPositionState = cameraPositionState
    ) {
        Marker(
            state = MarkerState(position = LatLng(-34.0, 151.0)),
            title = "Marker in Sydney"
        )
        Marker(
            state = MarkerState(position = LatLng(35.66, 139.6)),
            title = "Marker in Tokyo"
        )
    }
}