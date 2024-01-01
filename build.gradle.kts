/*
 * Copyright 2023-2024 Mikhail Titov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    application
    id("com.github.ben-manes.versions")
}

val projectGroup: String by project
val projectVersion: String by project

group = projectGroup
version = projectVersion

application {
    mainClass.set("dev.d1s.website.MainKt")
}

repositories {
    mavenCentral()
    maven(url = "https://maven.d1s.dev/releases")
    maven(url = "https://maven.d1s.dev/snapshots")
}

dependencies {
    val beamVersion: String by project

    val logbackVersion: String by project

    implementation(kotlin("reflect"))
    implementation(kotlin("stdlib"))

    implementation("dev.d1s.beam:beam-client-app:$beamVersion")

    implementation("ch.qos.logback:logback-classic:$logbackVersion")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.majorVersion
    }
}