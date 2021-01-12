import components.root
import kotlinx.browser.document
import react.dom.render

fun main() {
    render(document.getElementById("root")) {
        root()
    }
}