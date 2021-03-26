rootProject.name = "MyPage"
include("shared", "csr", "ssg")

val isCiServer = System.getenv().containsKey("CI")
buildCache {
    local {
        isEnabled = !isCiServer
    }
}
