package com.demo.device

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class DeviceViewModel(
    private val bleManager: BLEManager = BLEManager()
): ViewModel() {

    private val _state = MutableStateFlow("Disconnected")
    val state = _state.asStateFlow()

    fun connect(){
        viewModelScope.launch {
            _state.value = "Connecting"
            val result = bleManager.connect("device001")
            _state.value = if(result) "Connected" else "Failed"
        }
    }
}
