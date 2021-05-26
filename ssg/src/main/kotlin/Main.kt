import components.root
import lib.EmptyProps
import lib.ReactDOMServer
import lib.ServerStyleSheet
import react.createElement

fun main() {
    val sheet = ServerStyleSheet()
    val content = sheet.collectStyles(createElement(root, EmptyProps))
    val component = ReactDOMServer.renderToString(content)
    val style = sheet.getStyleElement()
    val header = ReactDOMServer.renderToString(style)
    sheet.seal()
    val html = """<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="styles.css">
<link rel="icon" type="image/vnd.microsoft.icon" href="favicon.ico">
<meta name="viewport" content="width=device-width,initial-scale=1">
<meta name="keywords" content="yt8492,マヤミト,富山雄太,Yuta Tomiyama">
<meta property="og:title" content="yt8492's portfolio">
<meta property="og:type" content="article">
<meta property="og:description" content="マヤミトのポートフォリオ">
<meta property="og:url" content="https://yt8492.com">
<meta property="og:site_name" content="マヤミトのポートフォリオ">
<meta property="og:image" content="https://yt8492.com/ogp.png">
<meta name="twitter:card" content="summary">
<title>yt8492.com</title>
$header
</head>
<body>
$component
</body>
</html>"""
    fs.writeFile("index.html", html) {
        println("Generate HTML Success")
    }
}
