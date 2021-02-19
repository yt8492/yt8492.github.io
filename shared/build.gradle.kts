plugins {
    kotlin("js")
}

repositories {
    jcenter()
    mavenCentral()
}

dependencies {
    api(kotlin("stdlib-js"))
    api("org.jetbrains:kotlin-react:17.0.1-pre.148-kotlin-1.4.30")
    api("org.jetbrains:kotlin-react-dom:17.0.1-pre.148-kotlin-1.4.30")
    api("org.jetbrains:kotlin-css:1.0.0-pre.148-kotlin-1.4.30")
    api("org.jetbrains:kotlin-styled:5.2.1-pre.148-kotlin-1.4.30")
}

kotlin {
    js(IR) {
        browser()
        nodejs()
    }
}
