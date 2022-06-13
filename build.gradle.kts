plugins {
    kotlin("jvm") version "1.6.21"
    application
}

repositories {
    mavenCentral()
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(11))
}

application {
    mainClass.set("MainKt")
    applicationDefaultJvmArgs += listOf("-Dfoo=value")
}
