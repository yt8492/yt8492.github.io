plugins {
    id("org.jetbrains.kotlin.js") version "1.4.0"
}

group = "com.yt8492"
version = "1.0-SNAPSHOT"

repositories {
    jcenter()
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation("org.jetbrains:kotlin-react:16.13.1-pre.112-kotlin-1.4.0")
    implementation("org.jetbrains:kotlin-react-dom:16.13.1-pre.112-kotlin-1.4.0")
    implementation("org.jetbrains:kotlin-css:1.0.0-pre.112-kotlin-1.4.0")
    implementation("org.jetbrains:kotlin-styled:1.0.0-pre.112-kotlin-1.4.0")
    implementation("org.jetbrains.kotlinx:kotlinx-html-js:0.7.2")
}

kotlin {
    target {
        browser {
            webpackTask {
                outputFileName = "main.js"
            }
            runTask {
                outputFileName = "main.js"
            }
        }
    }
}

val browserWebpack = tasks.getByName("browserProductionWebpack")

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

browserWebpack.finalizedBy(copyDistributions)
