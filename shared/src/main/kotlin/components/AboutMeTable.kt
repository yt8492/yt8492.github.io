package components

import kotlinx.css.Display
import kotlinx.css.FlexDirection
import kotlinx.css.JustifyContent
import kotlinx.css.TextAlign
import kotlinx.css.color
import kotlinx.css.display
import kotlinx.css.flexDirection
import kotlinx.css.fontSize
import kotlinx.css.justifyContent
import kotlinx.css.padding
import kotlinx.css.px
import kotlinx.css.textAlign
import kotlinx.css.width
import mobile
import react.RBuilder
import react.dom.key
import styled.css
import styled.styledDiv
import values.Colors

data class AboutMeTableInfo(val key: String, val value: String)

private fun RBuilder.row(info: AboutMeTableInfo) {
    styledDiv {
        attrs.key = info.toString()

        styledDiv {
            + info.key

            css {
                width = 100.px
                padding(top = 8.px, right = 12.px, bottom = 8.px, left = 0.px)
                color = Colors.text
                textAlign = TextAlign.end
                fontSize = 16.px

                mobile {
                    width = 80.px
                }
            }
        }
        styledDiv {
            + info.value

            css {
                width = 400.px
                padding(top = 8.px, right = 0.px, bottom = 8.px, left = 12.px)
                color = Colors.text
                fontSize = 16.px

                mobile {
                    width = 240.px
                }
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
