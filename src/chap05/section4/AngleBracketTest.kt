package chap05.section4.anglebrackettest

open class A {
    open fun f() = println("A class f()")
    fun a() = println("A class a()")
}

interface B {
    fun f() = println("B interface f()") //인터페이스는 기본적으로 open
    fun b() = println("B interface b()")
}

class C: A(), B {
    override fun f() = println("C class f()")

    fun test() {
        f() //현재 클래스의 f()
        b() //인터페이스 B의 b()
        super<A>.f()  //A 클래스의 f()
        super<B>.f() //B 클래스의 f()
    }
}

fun main() {
    val c = C()
    c.test()
}