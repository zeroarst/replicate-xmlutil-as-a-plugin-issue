package com.zeroarst.xmlutil

import org.gradle.api.Plugin
import org.gradle.api.Project

class XmlUtilGradlePlugin : Plugin<Project> {

    override fun apply(project: Project) {
        project.tasks.create("xmlUtilTest", XmlUtilTest::class.java)
    }
}