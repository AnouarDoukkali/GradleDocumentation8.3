plugins {
    `kotlin-dsl`
}
println("This is executed during the configuration phase in buildSrc build.gradle.kts")
extra["printName"] = true


// when the buildScript need external dependencies , those can be declared under buildScript Block
// In multi-project builds, dependencies declared using a project's buildscript() method are
// accessible to the build scripts of all its sub-projects.
buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
    }
}

