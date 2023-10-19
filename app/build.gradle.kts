group = property("GROUP").toString()
version = property("VERSION").toString()

plugins {
    kotlin("jvm")
    id("com.zeroarst.xmlutil")
}

println("build.gradle.kts (${name})")

group = "com.zeroarst"
version = "0.0.1"


repositories {
    google()
    mavenCentral()
}


dependencies {

}