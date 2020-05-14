package components

import kotlinx.css.Align
import kotlinx.css.Display
import kotlinx.css.FlexDirection
import kotlinx.css.alignItems
import kotlinx.css.display
import kotlinx.css.flexDirection
import react.RBuilder
import styled.css
import styled.styledDiv
import styled.styledSection

private val tableContent = listOf(
    AboutMeTableInfo("HN", "マヤミト"),
    AboutMeTableInfo("Name", "富山 雄太 (Yuta Tomiyama)"),
    AboutMeTableInfo("BirthDay", "2000/01/19"),
    AboutMeTableInfo("University", "会津大学 コンピュータ理工学部 (University of Aizu)"),
    AboutMeTableInfo("Mail", "contact[at]yt8492.com"),
    AboutMeTableInfo("Hobby", "Kotlin")
)

fun RBuilder.aboutMeSection() {
    styledSection {
        sectionTitle("About me")
        styledDiv {
            icon("icon/yt8492.jpg")
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