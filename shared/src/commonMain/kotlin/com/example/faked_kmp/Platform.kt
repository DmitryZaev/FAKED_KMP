package com.example.faked_kmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform