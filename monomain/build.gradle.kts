plugins {
    id("org.springframework.boot") version "2.6.4"
//    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    kotlin("jvm") version "1.6.10"
//    kotlin("plugin.spring") version "1.6.10"
//    kotlin("plugin.jpa") version "1.6.10"
}

dependencies {
    implementation(project(":account"))
    implementation(project(":feed"))
    implementation(project(":chat"))
    implementation(project(":stories"))
}