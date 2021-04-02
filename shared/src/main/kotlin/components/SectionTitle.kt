package components

import kotlinx.css.TextAlign
import kotlinx.css.color
import kotlinx.css.fontSize
import kotlinx.css.margin
import kotlinx.css.px
import kotlinx.css.textAlign
import mobile
import react.RBuilder
import styled.css
import styled.styledH2
import values.Colors

fun RBuilder.sectionTitle(title: String) {
    styledH2 {
        + title

        css {
            color = Colors.text
            fontSize = 48.px
            textAlign = TextAlign.center
            margin(top = 20.px, bottom = 20.px)

            mobile {
                fontSize = 32.px
            }
        }
    }
}
