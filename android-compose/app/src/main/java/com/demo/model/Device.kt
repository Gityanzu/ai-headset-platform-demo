package com.demo.model

/**
 * AI wearable device model.
 */
data class Device(
    val id: String,
    val name: String,
    val battery: Int,
    val firmware: String,
    val state: DeviceState
)

enum class DeviceState {
    IDLE,
    SCANNING,
    CONNECTING,
    CONNECTED,
    ERROR
}
