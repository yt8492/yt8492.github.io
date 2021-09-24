package components

import kotlinx.css.margin
import kotlinx.css.px
import react.RBuilder
import styled.css
import styled.styledSection

private val skills = listOf(
    "Kotlin",
    "Java",
    "Scala",
    "Swift",
    "Go",
    "TypeScript",
    "React",
    "Android",
    "Jetpack Compose",
    "iOS",
    "Spring Boot",
    "Ktor",
    "Kotlin/JS",
    "Gradle",
    "gRPC / protobuf",
    "GraphQL",
    "SQL",
    "Git / GitHub"
)

fun RBuilder.skillsSection() {
    styledSection {
        sectionTitle("Skills")
        skillList(skills)

        css {
            margin(top = 40.px)
        }
    }
}
