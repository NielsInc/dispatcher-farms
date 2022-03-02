package com.github.nielsinc.dispatcherfarms.services

import com.intellij.openapi.project.Project
import com.github.nielsinc.dispatcherfarms.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
