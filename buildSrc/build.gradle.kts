plugins {
    `kotlin-dsl`
}


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