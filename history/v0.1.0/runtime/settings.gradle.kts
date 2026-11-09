pluginManagement {
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == "fabric-loom") useModule("net.fabricmc:fabric-loom:${requested.version}")
        }
    }
    repositories {
        maven {
            name = "Fabric"
            url = uri("https://maven.fabricmc.net/")
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

rootProject.name = "meteor-lib-runtime-core"
