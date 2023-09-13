dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

pluginManagement {
    repositories {
        gradlePluginPortal()
    }
}

println("This is executed during the initialization phase in buildSrc settings.gradle.kts")
