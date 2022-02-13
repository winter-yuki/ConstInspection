package com.github.winteryuki.constinspection.services

import com.intellij.openapi.project.Project
import com.github.winteryuki.constinspection.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
