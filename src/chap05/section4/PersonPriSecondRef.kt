package chap05.section4.personprisecondref

class Person(firstName: String,
             out: Unit = println("[Primary Constructor] Parameter")) {
    val fName = println("[Property] Person name : $firstName")

    init {
        println("[init] Person init block") //초기화블록
    }

    constructor(firstName: String, age: Int,
                out: Unit = println("[Secondary Constructor] Parameter")): this(firstName) {
        println("[Secondary Constructor] Body : $firstName, $age")
    }

}

fun main() {
    val p1 = Person("Jake", 30)
    println()
    val p2 = Person("Tom")

}