package com.example.primerapp

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.primerapp.ui.theme.PrimerAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PrimerAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainView(Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun MainView(modifier: Modifier, devices: List<Device>){
    Column() {

        Text(text = "Catalogo",
            modifier = modifier.padding(all = 20.dp).background(Color.Green),
            style = typography.titleLarge,
            TextAlign = TextAlign.Center)

    }

    LazyColumn() {

    items(Devices.size){ index ->
        DeviceItemView(device=devices[index])

    }

    }
}

@Composable
fun DeviceItemView(device: Device) {
    TODO("")
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PrimerAppTheme{

        var devices by remember { MutableStateOf(ListOf<Device>)}

        MainView(Modifier.padding(top=24.dp),
            devices = devices)
    }

    private fun getDevices(OnResult: (List<Device>) -> Unit){

    }
}