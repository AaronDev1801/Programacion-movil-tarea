package com.example.primerapp

import kotlinx.serialization.descriptors.StructureKind
import java.lang.invoke.MethodHandles.constant

interface DeviceService {
    @GET(constant(object ))
    suspend fun getallobjects(): List<object>
}