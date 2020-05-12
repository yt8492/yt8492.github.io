package components

import kotlinx.css.Color
import kotlinx.css.Display
import kotlinx.css.FlexDirection
import kotlinx.css.JustifyContent
import kotlinx.css.TextAlign
import kotlinx.css.color
import kotlinx.css.display
import kotlinx.css.flexDirection
import kotlinx.css.justifyContent
import kotlinx.css.padding
import kotlinx.css.px
import kotlinx.css.textAlign
import kotlinx.css.width
import react.RBuilder
import styled.css
import styled.styledDiv

data class AboutMeTableInfo(val key: String, val value: String)

private fun RBuilder.row(info: AboutMeTableInfo) {
    styledDiv {
        styledDiv {
            + info.key

            css {
                width = 100.px
                padding(top = 8.px, right = 12.px, bottom = 8.px, left = 12.px)
                color = Color.white
                textAlign = TextAlign.end
            }
        }
        styledDiv {
            + info.value

            css {
                width = 400.px
                padding(top = 8.px, right = 12.px, bottom = 8.px, left = 12.px)
                color = Color.white
            }
        }

        css {
            display = Display.flex
            flexDirection = FlexDirection.row
            justifyContent = JustifyContent.flexStart
        }
    }
}

fun RBuilder.aboutMeTable(
    infoList: List<AboutMeTableInfo>
) {
    styledDiv {
        infoList.forEach {
            row(it)
        }

        css {
            display = Display.flex
            flexDirection = FlexDirection.column
            justifyContent = JustifyContent.center
        }
    }
}