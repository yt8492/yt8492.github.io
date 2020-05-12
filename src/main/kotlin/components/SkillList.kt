package components

import kotlinx.css.Color
import kotlinx.css.Display
import kotlinx.css.FlexDirection
import kotlinx.css.color
import kotlinx.css.display
import kotlinx.css.flexDirection
import kotlinx.css.fontSize
import kotlinx.css.px
import react.RBuilder
import styled.css
import styled.styledDiv
import styled.styledLi
import styled.styledUl

private fun RBuilder.col(skills: List<String>) {
    styledUl {
        skills.forEach {
            styledLi {
                + it

                css {
                    color = Color.white
                    fontSize = 20.px
                }
            }
        }
    }
}

fun RBuilder.skillList(list: List<String>) {
    val (col1, col2) = list.withIndex().partition {
        it.index % 2 == 0
    }.let {
        it.first.map { it.value } to it.second.map { it.value }
    }
    styledDiv {
        col(col1)
        col(col2)

        css {
            display = Display.flex
            flexDirection = FlexDirection.row
        }
    }
}
