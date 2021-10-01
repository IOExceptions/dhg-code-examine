package com.github.ioexceptions.dhgcodeexamine.services

import com.intellij.openapi.project.Project
import com.github.ioexceptions.dhgcodeexamine.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
