plugins {
    `kotlin-dsl`
    `java-gradle-plugin` // gradle development plugin
}

// defining the plugins being built 
gradlePlugin {
    plugins {
        create("myPlugins") {
            id = "my-plugin"
            implementationClass = "convention.plugins.MyPlugin"
        }
    }
}
