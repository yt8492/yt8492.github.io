import org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile

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

val browserWebpack = tasks.withType<Kotlin2JsCompile>()

val copyDistributions by tasks.registering {
    doLast {
        copy {
            val destinationDir = File("$rootDir/public")
            if (!destinationDir.exists()) {
                destinationDir.mkdir()
            }
            val distributions = File("$buildDir/distributions/")
            from(distributions)
            into(destinationDir)
        }
    }
}

browserWebpack.forEach {
    it.finalizedBy(copyDistributions)
}
