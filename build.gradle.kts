/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * To learn more about Gradle by exploring our Samples at https://docs.gradle.org/8.3/samples
 */
plugins {
    id("base")
    id("com.fussionlabs.gradle.go-plugin") version("0.6.7")
}

version = "1.0.0"

go {
    os = listOf("linux")
    arch = listOf("amd64")
    goVersion = "1.21.10"
}