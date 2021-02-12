import kotlinx.css.CSSBuilder
import kotlinx.css.RuleSet

fun CSSBuilder.mobile(block: RuleSet) {
    media("screen and (max-width:480px)", block)
}
