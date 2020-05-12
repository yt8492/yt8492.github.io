package components

import kotlinx.css.Display
import kotlinx.css.display
import kotlinx.css.height
import kotlinx.css.padding
import kotlinx.css.px
import kotlinx.css.width
import react.RBuilder
import styled.css
import styled.styledImg

fun RBuilder.icon(src: String) {
    styledImg(src = src) {
        css {
            display = Display.block
            width = 200.px
            height = 200.px
            padding(40.px)
        }
    }
}
