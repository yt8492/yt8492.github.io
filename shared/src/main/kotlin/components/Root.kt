package components

import kotlinx.css.Align
import kotlinx.css.Display
import kotlinx.css.FlexDirection
import kotlinx.css.JustifyContent
import kotlinx.css.alignItems
import kotlinx.css.backgroundColor
import kotlinx.css.display
import kotlinx.css.flexDirection
import kotlinx.css.fontFamily
import kotlinx.css.justifyContent
import react.RProps
import react.functionalComponent
import styled.css
import styled.styledDiv
import values.Colors

val root = functionalComponent<RProps> {
    styledDiv {
        aboutMeSection()
        skillsSection()
        activitySection()
        linksSection()

        css {
            display = Display.flex
            flexDirection = FlexDirection.column
            justifyContent = JustifyContent.center
            alignItems = Align.center
            backgroundColor = Colors.background
            fontFamily = "\"Hiragino Kaku Gothic ProN\", \"Meiryo\", sans-serif"
        }
    }
}
