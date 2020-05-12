package components

import kotlinx.css.Align
import kotlinx.css.Color
import kotlinx.css.Display
import kotlinx.css.FlexDirection
import kotlinx.css.alignItems
import kotlinx.css.color
import kotlinx.css.display
import kotlinx.css.flexDirection
import react.RBuilder
import styled.css
import styled.styledDiv
import styled.styledSection

private val tableContent = listOf(
    AboutMeTableInfo("HN", "マヤミト"),
    AboutMeTableInfo("名前", "富山 雄太 (Yuta Tomiyama)"),
    AboutMeTableInfo("大学", "会津大学 コンピュータ理工学部"),
    AboutMeTableInfo("メール", "contact[at]yt8492.com")
)

fun RBuilder.aboutMeSection() {
    styledSection {
        sectionTitle("About me")
        styledDiv {
            icon("./yt8492.jpg")
            aboutMeTable(tableContent)
            css {
                display = Display.flex
                flexDirection = FlexDirection.row
            }
        }
        css {
            display = Display.flex
            flexDirection = FlexDirection.column
            alignItems = Align.center
        }
    }
}