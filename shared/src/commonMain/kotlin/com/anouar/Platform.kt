package com.anouar

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
