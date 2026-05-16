package com.example.primerapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.unit.dp

@Composable
fun deviceview(device: Device){

    Row (VerticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(end = 16.dp)) {
        Icon(ImageVector = Icons.Default.Phone, ContentDescription = "icono",
            modifier = Modifier.Padding(15.dp))

        Column() {
            Text(text = device.name,
                style = typography.headlineLarge)

            Text(text = device.data.color ?: "-",
                style = typography.bodyMedium)

            Text(text = device.data.capacity ?: "-",
                style = typography.bodySmall)

            HorizontalDivider()
        }
    }
}