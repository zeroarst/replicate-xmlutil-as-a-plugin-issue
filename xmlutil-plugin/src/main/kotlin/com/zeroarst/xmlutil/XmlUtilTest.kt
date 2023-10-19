package com.zeroarst.xmlutil

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

open class XmlUtilTest : DefaultTask() {

    @TaskAction
    fun run() {
        println("run")
    }
}