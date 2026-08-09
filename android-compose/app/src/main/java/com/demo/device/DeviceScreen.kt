package com.demo.device

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue

@Composable
fun DeviceScreen(
    viewModel: DeviceViewModel
){
    val state by viewModel.state.collectAsState()

    Text(text = "Device Status: $state")

    Button(onClick = {
        viewModel.connect()
    }) {
        Text("Connect Device")
    }
}
