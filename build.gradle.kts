plugins {
    application
    kotlin("jvm") version "1.2.61"

    id("org.jetbrains.kotlin.kapt") version "1.3.0"
}

application {
    mainClassName = "main.MainKt"
}

dependencies {
    compile(kotlin("stdlib"))

    compile("com.google.dagger:dagger:2.16")

    kapt("com.google.dagger:dagger-compiler:2.16")
}

repositories {
    mavenCentral()
    jcenter()
}
