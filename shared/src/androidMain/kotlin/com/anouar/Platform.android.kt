@file:Suppress("MatchingDeclarationName") // detekt bug #6426

package com.anouar

class AndroidPlatform : Platform {
    override val name: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}

actual fun getPlatform(): Platform = AndroidPlatform()
