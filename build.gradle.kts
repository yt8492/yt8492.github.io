plugins {
    kotlin("js") version "1.4.30"
}

group = "com.yt8492"
version = "1.0-SNAPSHOT"

repositories {
    jcenter()
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation("org.jetbrains:kotlin-react:17.0.1-pre.144-kotlin-1.4.30")
    implementation("org.jetbrains:kotlin-react-dom:17.0.1-pre.144-kotlin-1.4.30")
    implementation("org.jetbrains:kotlin-css:1.0.0-pre.144-kotlin-1.4.30")
    implementation("org.jetbrains:kotlin-styled:5.2.0-pre.144-kotlin-1.4.30")
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
