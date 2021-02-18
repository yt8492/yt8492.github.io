import components.root
import lib.ServerStyleSheet
import lib.renderToString
import react.RProps
import react.createElement

fun main() {
    println(process.cwd())
    val sheet = ServerStyleSheet()
    val content = sheet.collectStyles(createElement(root, object : RProps {}))
    val component = renderToString(content)
    val style = sheet.getStyleElement()
    val header = renderToString(style)
    sheet.seal()
    val html = """
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="styles.css">
    <link rel="icon" type="image/vnd.microsoft.icon" href="favicon.ico">
    <meta name="keywords" content="yt8492,マヤミト,富山雄太,Yuta Tomiyama">
    <title>yt8492.com</title>
    $header
</head>
<body>
$component
</body>
</html>
"""
    fs.writeFile("index.html", html) {
        println("Generate HTML Success")
    }
}
