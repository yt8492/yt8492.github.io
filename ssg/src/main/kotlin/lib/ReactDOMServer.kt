package lib

import react.ReactElement

@JsModule("react-dom/server")
@JsNonModule
external object ReactDOMServer {
    fun renderToString(reactNode: ReactElement): String
    fun renderToString(reactNode: Array<ReactElement>): String
}
