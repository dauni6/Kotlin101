package chap07.section2

class Outer {
    val ov = 5
    class Nested { //기본적으로 중첩 클래스, 자바로는 static 클래스 이다.
        //그렇기 때문에 외부클래스에 접근이 불가능 하다.
        val nv = 10
        fun greeting() = "[Nested] Hello ! $nv"

        fun accessOuter() {
            println(country) // companion object의 프로퍼티에 쉽게 접근 가능
            getSomething() //마찬가지로 접근 가능
        }
    }

    fun outside() {
        val msg = Nested().greeting() // Outer객체 생성 없이 중첩 클래스 내부의 메서드 접근 가능
        println("[Outer]: $msg, ${Nested().nv}")
    }

    //중첩클래스가 바깥쪽 클래스에 접근 가능한 방법은 바로 companion object를 쓰는 방법 이다.
    companion object { //얘도 static이기 때문에 접근가능함
        const val country = "Korea"
        fun getSomething() = println("Get something...")
    }

}

fun main() {
    //static 처럼 Outer의 객체 생성 없이 Nested객체를 생성 사용할 수 있다.
    val output = Outer.Nested().greeting()
    println(output)
    Outer.Nested().accessOuter() //companion object를 쓰기에 접근가능.

    //Outer.outside() <- 이렇게 바로 사용하면 안됨. Outer는 객체 생성 필요.
    val outer = Outer()
    outer.outside()
}

//정리하기
/*
기본적으로 중첩(Nested)클래스, 자바로치면 static 클래스는 외부클래스에 접근이 불가능 하다.
        굳이 접근 가능하고자 한다면 외부클래스에 static으로 된 멤버변수나 메서드가 있으면 된다.
*/
