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
import kotlinx.css.paddingBottom
import kotlinx.css.paddingLeft
import kotlinx.css.paddingRight
import kotlinx.css.paddingTop
import kotlinx.css.px
import kotlinx.css.textAlign
import kotlinx.css.width
import mobile
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
                paddingLeft = 8.px
                paddingRight = 8.px
                color = Color.white
                textAlign = TextAlign.start
                fontSize = 16.px

                mobile {
                    width = 100.px
                }
            }
        }

        styledDiv {
            styledDiv {
                + activity.activityName

                css {
                    paddingLeft = 8.px
                    paddingRight = 8.px
                }
            }
            activity.result?.let { result ->
                styledDiv {
                    + result

                    css {
                        paddingLeft = 8.px
                        paddingRight = 8.px
                        fontWeight = FontWeight.bold

                        mobile {
                            paddingTop = 2.px
                            paddingBottom = 2.px
                        }
                    }
                }
            }

            css {
                display = Display.flex
                flexDirection = FlexDirection.row
                width = 480.px
                color = Color.white
                fontSize = 16.px

                mobile {
                    flexDirection = FlexDirection.column
                    width = 220.px
                }
            }
        }

        css {
            display = Display.flex
            flexDirection = FlexDirection.row
            paddingTop = 8.px
            paddingBottom = 8.px
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