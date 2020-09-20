package components

import kotlinx.css.margin
import kotlinx.css.px
import react.RBuilder
import styled.css
import styled.styledSection

private val activityContents = listOf(
    Activity("2018/04 ~ now", "Zli", "代表(2020~)"),
    Activity("2018/12 ~ now", "The Designium インターン"),
    Activity("2020/09", "DMM GUILD 2020"),
    Activity("2020/08", "DeNA サマーインターン"),
    Activity("2020/03", "リクルート インターン"),
    Activity("2020/02", "2222ハッカソン"),
    Activity("2019/09", "Discovery Hackathon 2019"),
    Activity("2019/09", "DMM インターン"),
    Activity("2019/04", "平成最後のハッカソン"),
    Activity("2019/03", "サイバーエージェント インターン"),
    Activity("2018/12", "Yahoo! JAPAN Hack Day 2018"),
    Activity("2018/12 ~ 2020/02", "ソラミツ アソシエイト社員"),
    Activity("2018/08", "石巻ハッカソン2018", "ヤバい賞"),
    Activity("2018/05 ~ 2019/06", "プライズ アルバイト"),
    Activity("2016/11", "パソコン甲子園 プログラミング部門", "本戦出場")
)

fun RBuilder.activitySection() {
    styledSection {
        sectionTitle("Activities")
        activityList(activityContents)

        css {
            margin(top = 40.px)
        }
    }
}