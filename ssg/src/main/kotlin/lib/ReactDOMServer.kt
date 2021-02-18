@file:JsModule("react-dom/server")
@file:JsNonModule
package lib

import react.ReactElement

external fun renderToString(reactNode: ReactElement): String
external fun renderToString(reactNode: Array<ReactElement>): String
