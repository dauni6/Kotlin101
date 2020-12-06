package chap10.section1

fun main() {

    data class Person(var name: String, var skills: String)
    var person = Person("kildong", "Koltin")

    val a = person.let {
        it.skills = "Android"
        "Success"
    }

    println("a $a, person $person")

    val b = person.also {
        it.skills = "Android"
        "Success" //also 마지막 리턴 없음
    }

    println("b $b, person $person")



}