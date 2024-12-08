package org.kotlin.notes

/*
plugins {
    // Apply the application plugin to add support for building a CLI application
    id("application")

    // Apply the plugin which adds support for Java
    id("java")

    // Apply the plugin which adds support for Kotlin/JVM
    id("org.jetbrains.kotlin.jvm")
}
 */


/*
repositories {
    jcenter()
    mavenCentral()
    flatDir {
        dirs 'libs'
    }
}
 */


/*

dependencies {
    // Use JUnit test framework.
    testImplementation 'junit:junit:4.13'

    // This dependency is used by the application.
    implementation 'com.google.guava:guava:29.0-jre'
}
 */


/*
Configure main class

application {
    // Defines the main class for the application
    mainClass = "org.hyperskill.gradleapp.App"
}
 */


/*
tasks

tasks.jar {
    manifest {
        attributes("Main-Class" to "org.hyperskill.gradleapp.AppKt")
    }
}
 */



/* Generate jar and exec

gradle jar
java -jar app/build/libs/app.jar

 */


/*
Init app in gradle

gradle init
 */