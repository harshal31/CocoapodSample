package com.compose.cocoapod_sample

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform

expect fun parseTimeInString(value: Double): String