package components

import react.RBuilder
import styled.styledSection

private val skills = listOf(
    "Kotlin",
    "Java",
    "Scala",
    "Swift",
    "Go",
    "Android",
    "iOS",
    "Spring Boot",
    "Ktor",
    "Kotlin/JS",
    "Gradle",
    "gRPC / protobuf",
    "SQL",
    "Git / GitHub"
)

fun RBuilder.skillsSection() {
    styledSection {
        sectionTitle("Skills")
        skillList(skills)
    }
}
