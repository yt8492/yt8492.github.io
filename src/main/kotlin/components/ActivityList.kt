package components

import kotlinx.css.Color
import kotlinx.css.Display
import kotlinx.css.FlexDirection
import kotlinx.css.FontWeight
import kotlinx.css.JustifyContent
import kotlinx.css.TextAlign
import kotlinx.css.color
import kotlinx.css.display
import kotlinx.css.flexDirection
import kotlinx.css.fontSize
import kotlinx.css.fontWeight
import kotlinx.css.justifyContent
import kotlinx.css.padding
import kotlinx.css.px
import kotlinx.css.textAlign
import kotlinx.css.width
import react.RBuilder
import react.dom.key
import styled.css
import styled.styledDiv

data class Activity(
    val term: String,
    val activityName: String,
    val result: String? = null
)

private fun RBuilder.row(activity: Activity) {
    styledDiv {
        attrs.key = activity.toString()

        styledDiv {
            + activity.term

            css {
                width = 200.px
                padding(top = 8.px, right = 8.px, bottom = 8.px, left = 8.px)
                color = Color.white
                textAlign = TextAlign.start
                fontSize = 16.px
            }
        }

        styledDiv {
            styledDiv {
                + activity.activityName

                css {
                    padding(top = 8.px, right = 8.px, bottom = 8.px, left = 8.px)
                }
            }
            activity.result?.let { result ->
                styledDiv {
                    + result

                    css {
                        padding(top = 8.px, right = 8.px, bottom = 8.px, left = 8.px)
                        fontWeight = FontWeight.bold
                    }
                }
            }

            css {
                display = Display.flex
                flexDirection = FlexDirection.row
                width = 370.px
                color = Color.white
                fontSize = 16.px
            }
        }

        css {
            display = Display.flex
            flexDirection = FlexDirection.row
        }
    }
}

fun RBuilder.activityList(list: List<Activity>) {
    styledDiv {
        list.forEach {
            row(it)
        }

        css {
            display = Display.flex
            flexDirection = FlexDirection.column
            justifyContent = JustifyContent.center
        }
    }
}