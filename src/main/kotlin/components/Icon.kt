package components

import kotlinx.css.Display
import kotlinx.css.LinearDimension
import kotlinx.css.display
import kotlinx.css.height
import kotlinx.css.rem
import kotlinx.css.width
import react.RBuilder
import styled.css
import styled.styledImg

fun RBuilder.icon(src: String) {
    styledImg(src = src) {
        css {
            css {
                display = Display.block
                width = 10.rem
                height = LinearDimension.auto
            }
        }
    }
}