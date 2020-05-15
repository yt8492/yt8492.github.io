package components

import kotlinx.css.Align
import kotlinx.css.Display
import kotlinx.css.FlexDirection
import kotlinx.css.JustifyContent
import kotlinx.css.alignItems
import kotlinx.css.display
import kotlinx.css.flexDirection
import kotlinx.css.fontFamily
import kotlinx.css.justifyContent
import react.RBuilder
import styled.css
import styled.styledDiv

fun RBuilder.root() {
    styledDiv {
        aboutMeSection()
        skillsSection()
        linksSection()

        css {
            display = Display.flex
            flexDirection = FlexDirection.column
            justifyContent = JustifyContent.center
            alignItems = Align.center
            fontFamily = "\"Hiragino Kaku Gothic ProN\", \"Meiryo\", sans-serif"
        }
    }
}
