package com.demo.device

import com.demo.model.Device

interface DeviceRepository {
    suspend fun connect(): Device
}
