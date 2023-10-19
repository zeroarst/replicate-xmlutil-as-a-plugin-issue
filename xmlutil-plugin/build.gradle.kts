group = property("GROUP").toString()
version = property("VERSION").toString()


plugins {
    println("build.build.gradle.kts => plugins (test-composite-build)")
    kotlin("jvm") version "1.9.0"
    // `kotlin-dsl`
    `java-gradle-plugin`
}


group = "com.zeroarst"
version = "0.0.1"


repositories {
    google()
    mavenCentral()
    maven {
        url  = uri("https://s01.oss.sonatype.org/content/repositories/releases/")
    }
}


dependencies {
    implementation("io.github.pdvrieze.xmlutil:core:0.86.2")
    implementation("io.github.pdvrieze.xmlutil:serialization:0.86.2")
}

gradlePlugin {
    plugins {
        create(property("PLUGIN_ID").toString()) {
            id = property("PLUGIN_ID").toString()
            displayName = property("PLUGIN_DISPLAY_NAME").toString()
            description = property("PLUGIN_DESCRIPTION").toString()
            implementationClass = property("PLUGIN_IMPLEMENTATION_CLASS").toString()
        }
    }
}