package chap06.section1.section3.companionobjecttest

class Person {
    var id: Int = 0;
    var name: String = "john doe"

    companion object {
        var language = "Korean"
        fun work() {
            println("working....")
        }
    }
}

fun main() {
    println(Person.language) //고정된 메모리에 올라가 있기 때문에, 인스턴스에 접근하지 않아도 바로 사용가능
    Person.language = "English" //변경도 가능
    //Person.id 접근 불가능
    Person.work() //메서드 실행 가능
    val person = Person()
    person.id = 13 //인스턴스를 생성하여 사용하면 접근가능하다


}

