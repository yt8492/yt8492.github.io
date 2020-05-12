package components

import kotlinx.css.Display
import kotlinx.css.FlexDirection
import kotlinx.css.display
import kotlinx.css.flexDirection
import kotlinx.css.margin
import kotlinx.css.px
import react.RBuilder
import styled.css
import styled.styledDiv
import styled.styledSection

private val logos = listOf(
    "./logo/twitter-brands.svg" to "https://twitter.com/yt8492",
    "./logo/facebook-brands.svg" to "https://www.facebook.com/yt8492",
    "./logo/github-brands.svg" to "https://github.com/yt8492",
    "./logo/speaker-deck-brands.svg" to "https://speakerdeck.com/yt8492",
    "./logo/hatenablog-logo.svg" to "https://yt8492.hatenablog.com",
    "./logo/search-solid.svg" to "https://qiita.com/yt8492"
)

fun RBuilder.linksSection() {
    styledSection {
        sectionTitle("Links")
        styledDiv {
            logos.forEach {
                linkButton(it.first, it.second)
            }

            css {
                display = Display.flex
                flexDirection = FlexDirection.row
            }
        }

        css {
            margin(top = 40.px)
        }
    }
}
