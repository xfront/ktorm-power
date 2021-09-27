package com.github.xfront.ktormpower.services

import com.intellij.openapi.project.Project
import com.github.xfront.ktormpower.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
