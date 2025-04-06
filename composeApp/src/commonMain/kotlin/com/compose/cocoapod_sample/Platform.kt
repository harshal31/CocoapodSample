package com.compose.cocoapod_sample

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform

expect fun parsePhoneNumber(value: Double): String