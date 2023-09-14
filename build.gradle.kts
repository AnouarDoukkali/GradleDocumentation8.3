import io.gitlab.arturbosch.detekt.Detekt

plugins {
    alias(libs.plugins.detekt)
    java
    id("my-plugin") apply false
}

dependencies {
    detektPlugins(libs.detektFormatting)
}

detekt {
    source.setFrom(file(projectDir))
    parallel = true
    autoCorrect = true

    tasks.withType<Detekt> {
        exclude("**/resources/**")
        exclude("**/build/**")
        include("**/*.kt")
        include("**/*.kts")
    }
}

// configuration phase
println("This is executed during the configuration phase in root build.gradle.kts")


//configuration phase 
tasks.register("configured") {
    println("This is also executed during the configuration phase, because :configured is used in the build.")
    doFirst {
        println("This is executed first during the execution phase.")
    }
    doLast {
        println("This is executed last during the execution phase.")
    }
}

// project object
println("this project name is ${project.name}")

// execute before and after every project is evaluated
gradle.beforeProject {
    // Set a default value to extra property named printName
    project.ext.set("printName", false)
}

// execute after evaluating each project
gradle.afterProject {
    if (project.ext.has("printName") && project.ext.get("printName") as Boolean) {
        println("this project name is ${project.name}")
    }
}


// register a task
tasks.register("hello") {
    doFirst {
        println("Hello Earth")
    }
}

// get a task by it's name
tasks.named("hello") {
    doLast {
        println("print last ")
    }
}
// execute a default task if no task are specified
defaultTasks("clean")

// we can set extra properties for the current project like this
val purpose by extra("debug")
extra["version"] = "1.0"

// get project object extra properties
tasks.register("extra") {
    doLast {
        println("getting current project extra property purpose : ${project.extra.get("purpose")}")
        println("getting current project extra property version : ${project.extra.get("version")}")
    }
}

