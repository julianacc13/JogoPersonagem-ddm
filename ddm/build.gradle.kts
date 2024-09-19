// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
}

subprojects {
    afterEvaluate {
        if (plugins.hasPlugin("com.android.application")) {
            extensions.configure<com.android.build.gradle.BaseExtension>("android") {
                compileSdkVersion(33)
                defaultConfig {
                    minSdk = 21
                    targetSdk = 33
                }
            }
        }
    }
}
