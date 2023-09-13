pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "FirstKmmApp"
include(":androidApp")
include(":shared")

println("This is executed during the initialization phase in settings.gradle.kts")
