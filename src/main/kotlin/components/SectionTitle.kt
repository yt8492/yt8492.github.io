package components

import kotlinx.css.Color
import kotlinx.css.color
import kotlinx.css.fontSize
import kotlinx.css.px
import react.RBuilder
import styled.css
import styled.styledH2

fun RBuilder.sectionTitle(title: String) {
    styledH2 {
        + title

        css {
            color = Color.white
            fontSize = 48.px
        }
    }
}
