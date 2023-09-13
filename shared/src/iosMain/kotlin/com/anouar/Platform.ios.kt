// import platform.UIKit.UIDevice // need a mac device
@file:Suppress("MatchingDeclarationName") // detekt bug #6426

package com.anouar

class IOSPlatform : Platform {
    // override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
    override val name: String
        get() = TODO("Not yet implemented")
}

actual fun getPlatform(): Platform = IOSPlatform()
