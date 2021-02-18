plugins {
    kotlin("js")
}

repositories {
    jcenter()
    mavenCentral()
}

dependencies {
    implementation(project(":shared"))
}

kotlin {
    js(IR) {
        browser {
            webpackTask {
                outputFileName = "main.js"
            }
            runTask {
                outputFileName = "main.js"
            }
        }
        binaries.executable()
    }
}
