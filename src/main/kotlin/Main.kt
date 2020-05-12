import components.root
import react.dom.render
import kotlin.browser.document

fun main() {
    render(document.getElementById("root")) {
        root()
    }
}