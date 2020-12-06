package chap07.section1

interface A {
    fun functionA() {
        println("A입니다.")
    }
}

interface B {
    fun functionB() {
        println("B입니다.")
    }
}

class C constructor(val a: A, val b: B) {

    fun functionC() {
        a.functionA()
        b.functionB()
    }
}

class DelegateC(a: A, b: B): A by a, B by b {
    fun functionC() {
        functionA()
        functionB()
    }
}
