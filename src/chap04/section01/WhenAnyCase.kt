package chap04.section01

class MyClass(){}

fun main() {
    cases("Hello") //String
    cases(1) //Int
    cases(System.currentTimeMillis()) //Long
    cases(MyClass()) //객체, 객체는 생성자의 호출로부터 만들어짐
}

fun cases(obj: Any) {
    when (obj) {
        1 -> println("Int: $obj")
        "Hello" -> println("String: $obj")
        is Long -> println("Long: $obj")
        !is String -> println("Not a String")
        else -> println("Unknown")
    }
}