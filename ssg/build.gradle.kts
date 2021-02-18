plugins {
    kotlin("js")
}

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(project(":shared"))
    implementation(npm("webpack-node-externals", "2.5.1"))
    implementation("org.jetbrains.kotlinx:kotlinx-nodejs:0.0.7")
}

kotlin {
    js(IR) {
        useCommonJs()
        browser {
            webpackTask {
                outputFileName = "main.js"
            }
            runTask {
                outputFileName = "main.js"
            }
        }
        nodejs()
        binaries.executable()
    }
}