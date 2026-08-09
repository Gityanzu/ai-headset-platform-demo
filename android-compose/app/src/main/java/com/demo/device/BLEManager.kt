package com.demo.device

/**
 * BLE硬件通信抽象层
 *
 * 实际项目中这里对接 BluetoothGatt
 */
class BLEManager {

    suspend fun connect(deviceId: String): Boolean {
        // TODO connect bluetooth device
        return true
    }

    suspend fun getBattery(): Int {
        return 90
    }
}
