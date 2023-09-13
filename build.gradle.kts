import io.gitlab.arturbosch.detekt.Detekt

plugins {
    alias(libs.plugins.detekt)
    java
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
// execute default task if no task are specified
defaultTasks("clean")