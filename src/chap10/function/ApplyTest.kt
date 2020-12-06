package chap10.section1

fun main() {

    data class Person(var name: String, var skills: String)
    var person = Person("kildong", "Koltin")

    /*val a = person.let {
        it.skills = "Android"
        "Success"
    }*/

   /* val a = person.also {
        it.skills = "Android" // also는 it으로 접근하여 사용.
        "Success"
    }*/

    val a = person.apply {
        name = "Sean" //apply는 it 없이 바로 사용 가능
        skills = "IOS"
    }

    println("a $a, person $person")

}