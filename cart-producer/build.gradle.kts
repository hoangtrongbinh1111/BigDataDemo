/*
 * This file was generated by the Gradle "init" task.
 */

plugins {
    application
}
buildscript {
    repositories {
        mavenCentral()
    }
}
repositories {
    mavenCentral()
    maven("https://packages.confluent.io/maven/")
    maven("https://jitpack.io")
}

application {
    mainClassName = "org.bd.cart.CartProducer"
}

dependencies {
    compile("org.apache.kafka:kafka_2.11:2.2.0")
    compile("com.typesafe:config:1.3.4")
    compile("com.fasterxml.jackson.module:jackson-module-scala_2.11:2.9.8")
    compile("com.fasterxml.jackson.datatype:jackson-datatype-jdk8:2.9.8")
    compile("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.9.8")
    compile("org.apache.commons:commons-lang3:3.9")
    compile(project(":dto"))
}