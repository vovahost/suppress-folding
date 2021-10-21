package com.github.vovahost.suppressfolding.services

import com.intellij.openapi.project.Project
import com.github.vovahost.suppressfolding.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
