pluginManagement {
    //we can set plugins in pluginManagement Block to use them in any project

    plugins {
        //we can customise version from gradle.properties
        val updateDependenciesPluginVersion:String by settings
        id("com.github.ben-manes.versions").version(updateDependenciesPluginVersion) apply false
    }
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
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
