package com.github.kiun2007.bvtemplate.services

import com.intellij.openapi.project.Project
import com.github.kiun2007.bvtemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
