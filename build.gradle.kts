plugins {
    kotlin("jvm") version "1.7.0"
}

java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test:1.5.31")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.8.2")
    testImplementation("org.assertj:assertj-core:3.23.1")
    testImplementation("io.kotest:kotest-assertions-core-jvm:5.3.1")
    testImplementation("io.kotest:kotest-property-jvm:5.3.1")
    testImplementation("io.kotest:kotest-runner-junit5-jvm:5.3.1")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
