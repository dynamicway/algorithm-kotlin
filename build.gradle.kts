plugins {
    kotlin("jvm") version "1.6.0-M1"
}

java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test:1.5.31")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.8.2")
    testImplementation("org.assertj:assertj-core:3.21.0")
    testImplementation("io.kotest:kotest-assertions-core-jvm:5.0.3")
    testImplementation("io.kotest:kotest-property-jvm:5.0.3")
    testImplementation("io.kotest:kotest-runner-junit5-jvm:5.0.3")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "17"
    }
}
