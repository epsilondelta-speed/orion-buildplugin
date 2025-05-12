plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
    id("com.gradle.plugin-publish") version "1.2.1"
}

repositories {
    google()
    mavenCentral()
}

group = "co.epsilondelta.orion"
version = "1.0.0"

gradlePlugin {
    // Configure website and vcsUrl directly here
    website.set("https://github.com/epsilondelta-speed/orion-buildplugin") // Use .set() for Provider properties
    vcsUrl.set("https://github.com/epsilondelta-speed/orion-buildplugin.git") // Use .set()

    plugins {
        create("orionPerfPlugin") {
            id = "co.epsilondelta.orion.buildplugin"
            implementationClass = "co.epsilondelta.orion.buildplugin.OrionPerfPlugin" // Ensure this matches your package and class

            // Configure these directly within the plugin definition
            displayName = "Orion Performance Plugin"
            description = "Bytecode instrumentation plugin for OkHttp performance tracking in Android apps"
            tags.set(listOf("android", "performance", "instrumentation", "okhttp")) // Use .set() for Property<List<String>>
        }
    }
}

tasks.withType<ProcessResources>().configureEach {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}

dependencies {
    compileOnly(gradleApi())

    // ✅ Compile against AGP 8.9.1 to match your app
    compileOnly("com.android.tools.build:gradle-api:8.9.1")
    compileOnly("com.android.tools.build:gradle:8.9.1")


    // ✅ ASM libraries for bytecode instrumentation
    compileOnly("org.ow2.asm:asm:9.6")
    compileOnly("org.ow2.asm:asm-commons:9.6")
}
/*
pluginBundle {
    website = "https://github.com/epsilondelta-speed/orion-buildplugin"
    vcsUrl = "https://github.com/epsilondelta-speed/orion-buildplugin.git"
    tags = listOf("android", "performance", "instrumentation")

    plugins {
        named("orionPerfPlugin") {
            id = "co.epsilondelta.orion.buildplugin"
            displayName = "Orion Performance Plugin"
            description = "Bytecode instrumentation plugin for OkHttp performance tracking in Android apps"
        }
    }
}*/
