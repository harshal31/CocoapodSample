package com.compose.cocoapod_sample

// Enum constants (check these match exactly from the pod)

import cocoapods.FormatterKit.TTTTimeIntervalFormatter
import kotlinx.cinterop.ExperimentalForeignApi
import platform.UIKit.UIDevice

class IOSPlatform : Platform {
    override val name: String =
        UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}

actual fun getPlatform(): Platform = IOSPlatform()

@OptIn(ExperimentalForeignApi::class)
actual fun parsePhoneNumber(value: Double): String {
    val formatter = TTTTimeIntervalFormatter()
    return formatter.stringForTimeInterval(value) ?: "Invalid"
}


