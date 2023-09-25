package components

import kotlinx.css.Align
import kotlinx.css.Display
import kotlinx.css.FlexDirection
import kotlinx.css.alignItems
import kotlinx.css.display
import kotlinx.css.flexDirection
import mobile
import react.RBuilder
import styled.css
import styled.styledDiv
import styled.styledSection

private val tableContent = listOf(
    AboutMeTableInfo("HN", "マヤミト"),
    AboutMeTableInfo("Name", "富山 雄太 (Yuta Tomiyama)"),
    AboutMeTableInfo("BirthDay", "2000/01/19"),
    AboutMeTableInfo("Working at", "DMM.com LLC"),
    AboutMeTableInfo("Mail", "contact[at]yt8492.com"),
    AboutMeTableInfo("Hobby", "Kotlin")
)

fun RBuilder.aboutMeSection() {
    styledSection {
        sectionTitle("About me")
        styledDiv {
            icon("icon/yt8492.jpg", "icon/yt8492-200.jpg", "icon/yt8492-150.jpg")
            aboutMeTable(tableContent)
            css {
                display = Display.flex
                flexDirection = FlexDirection.row
                mobile {
                    flexDirection = FlexDirection.column
                    alignItems = Align.center
                }
            }
        }
        css {
            display = Display.flex
            flexDirection = FlexDirection.column
            alignItems = Align.center
        }
    }
}
