package components

import kotlinx.css.Display
import kotlinx.css.display
import kotlinx.css.padding
import kotlinx.css.px
import react.RBuilder
import styled.css
import styled.styledImg

fun RBuilder.icon(src: String, srcPC: String, srcMobile: String) {
    styledImg(src = src) {
        attrs["srcSet"] = "$srcMobile 150w, $srcPC 200w"
        attrs["sizes"] = "(max-width: 480px) 150px, 200px"
        css {
            display = Display.block
            padding(40.px)
        }
    }
}
