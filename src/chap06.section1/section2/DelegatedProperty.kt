package chap06.section1.section2.delegatedproperty

import kotlin.properties.Delegates

class User {
    var name: String by Delegates.observable("NONAME") {
        property, oldValue, newValue ->
        println("$oldValue -> $newValue")
    }
}

fun main() {
    val user = User()
    user.name = "Kildong" //값이 변경되는 시점에서 이벤트 발생
    user.name = "Dooly"
}

