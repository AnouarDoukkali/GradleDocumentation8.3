package convention.plugins

import org.gradle.api.Plugin
import org.gradle.api.Project

// the class of the custom plugin
class MyPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        val projectName = project.name
        project.tasks.register("displayProjectName") {
            group = "custom"
            description = "Display the current project name"
            doLast {
                println("Current project name: $projectName")
            }
        }
    }
}