package components

import kotlinx.css.Display
import kotlinx.css.LinearDimension
import kotlinx.css.backgroundColor
import kotlinx.css.borderRadius
import kotlinx.css.display
import kotlinx.css.height
import kotlinx.css.lineHeight
import kotlinx.css.margin
import kotlinx.css.padding
import kotlinx.css.pct
import kotlinx.css.properties.LineHeight
import kotlinx.css.properties.scale
import kotlinx.css.properties.transform
import kotlinx.css.px
import kotlinx.css.width
import react.RBuilder
import react.dom.key
import styled.css
import styled.styledA
import styled.styledImg
import values.Colors

fun RBuilder.linkButton(src: String, url: String) {
    styledA(href = url, target = "_blank") {
        attrs.key = url

        styledImg(src = src) {
            css {
                width = LinearDimension.inherit
            }
        }

        css {
            display = Display.block
            width = 50.px
            height = 50.px
            padding(12.px)
            margin(20.px)
            lineHeight = LineHeight("50px")
            backgroundColor = Colors.text
            borderRadius = 50.pct

            hover {
                transform {
                    scale(1.1, 1.1)
                }
            }
        }
    }
}