package com.github.austenyad.mvvmtemplate.services

import com.github.austenyad.mvvmtemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
