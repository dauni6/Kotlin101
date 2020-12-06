package chap05.section5.protectedtest

open class Base { //최상위에는 지시자 사용 불가
    protected var i = 1
    protected fun protectedFunc() {
        i += 1 //접근가능
    }
    fun access() {
        protectedFunc(); //접근 가능
    }
    protected class Nested //내부 클래스에는 지시자 사용 가능
}

class Derived: Base() {
    fun test(base: Base): Int {
        protectedFunc() //Base 클래스의 메서드 접근가능
        return i //Base 클래스의 프로퍼티 접근가능
    }
}

fun main() {
    val base  = Base() //생성가능
    //base.i 불가능
    //base.protectedFunc() 접근불가
    base.access() //접근가능
}