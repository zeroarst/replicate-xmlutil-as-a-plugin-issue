import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.21"
    application
}

group = "com.zeroarst"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
