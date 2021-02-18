@file:JsModule("styled-components")
@file:JsNonModule
package lib

import react.ReactElement

external class ServerStyleSheet {
    fun collectStyles(element: ReactElement): ReactElement
    fun getStyleElement(): Array<ReactElement>
    fun seal()
}
