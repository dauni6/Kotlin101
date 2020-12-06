package chap06.section1.section2.lateinit

class Person {
    lateinit var name : String //지연 초기화 선언, 기본적으로 코틀린은 무조건 프로퍼티가 초기화되어 있어야 된다.

    fun test() {
        if (!::name.isInitialized) { //프로퍼티 초기화 여부 판단, ::(더블콜론, 리플랙션)을 사용하여 프로퍼티를 객체로서 참조함.
            println("not initialized")
        } else {
            println("initialized")
        }
    }
}

fun main() {
    val kildong = Person()
    kildong.test()
    kildong.name = "Kilding" // 이 시점에서 초기화됨(지연초기화)
    kildong.test()
    println("name = ${kildong.name}")
}

