package chap10.section1

fun main() {
    data class Person(var name : String, var skills: String)
    var person = Person("Kildong", "Kotlin")
    var retRunObj = person.apply { 
        this.name = "Sean"
        this.skills = "Java"
        "Success" // apply는 마지막자료형 반환 안됨
    }

    println(person)
    println("retRunObj: $retRunObj")
    
    // run을 객체에 사용하기
    val retRunObj2 = person.run {
        this.name = "Dooly"
        this.skills = "C#"
        "Success"
    }

    println(person)
    println("retRunObj2: $retRunObj2")

    // run을 익명함수처럼 사용하기
    val a = run {
        1 + 3
    }
    println(a)

    
}