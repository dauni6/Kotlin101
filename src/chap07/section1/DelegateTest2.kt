package chap07.section1

interface Nameable {
    var name: String
}

class StaffName : Nameable {
    override var name: String = "Sean" //Nameable의 구현부가 된다. 그래서 얘가 실행됨.
}

class Work : Runnable { // 스레드 실행을 위한 인터페이스
    override fun run() {
        println("work...")
    }
}

//각 매개변수에 해당 인터페이스를 위임한다.
class Person(name: Nameable, work: Runnable): Nameable by name, Runnable by work

fun main() {
    val person = Person(StaffName(), Work()) //생성자를 사용해서 바로 객체 전달
    println(person.name) //StaffName 클래싀의 name에 접근
    person.run() //여기서는 Work 클래스의 run 접근
}