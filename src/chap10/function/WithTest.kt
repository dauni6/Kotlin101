package chap10.section1

fun main() {
    data class User(val name: String, var skills: String, var email: String? = null)
    var user = User(name = "Kildong", skills = "default")

    val result = with(user) {
        skills = "Kotlin"
        email = "Kildong@example.com"
        //마지막식에 반환값을 넣어줄 수도 있다. 넣지 않으면 기본값으로 Unit 반환.
    }

    println(user)
    println("result: $result")

}