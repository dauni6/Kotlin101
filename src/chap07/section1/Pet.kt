package chap07.section1

//인터페이스는 일종의 계약서 이다. 무엇을 하라는 추상적인 활동들이 적혀 있다.
//이를 구현하려는 클래스는 인터페이스에 적혀있는 활동들을 반드시 구현해야한다.
//인터페이스 자체로는 추상클래스와 마찬가지로 객체가 만들어질 수 없다
//추상클래스와 다른점이라고 한다면 말그대로 인터페이스는 클래스가 아니므로 다중 상속이 가능하다.
//인터페이스를 구현하려는 클래스의 경우에는 여러개의 인터페이스를 구현할 수 있다.
//추상클래스의 경우에는 클래스이므로 강한 연관성을 갖는다.
//이 말은 클래스이기에 구현하려는 클래스가 상속을 받으면 자연스럽게 상하관계(슈퍼클래스와 서브클래스)가 생기므로
//슈퍼클래스에 변화가 생기면 서브클래스에 영향을 준다는 것 이다.
//그러나 인터페이스의 경우에는 구현하려는 클래스가 직접 구현하여 사용하는 것이므로 그 연관의 정도가 강하지 않다.

//자바와의 다른점이라고 한다면 기본적으로 구현내용이 포함될 수 있다. (일바 메서드 선언가능)
//자바의 경우 자바8이후부터 default 키워드를 사용해야만 인터페이스 안에서 미리 구현이 가능하다. 다른 오래된 언어들은 기본적으로 interface에서 구현이 불가능 하다.
//인터페이스의 경우 자바도 마찬가지 이지만 기본적인 선언은 abstract가 없어도 추상 프로퍼티, 추상 메서드가 된다.

interface Pet {
    var category: String //abstract 키워드가 없어도 기본적으로 추상 프로퍼티

    val msgTags: String //val 선언 시 게터의 구현이 가능, 그러나 기본적으로 인터페이스에서는 프로퍼티에 값을 저장할 수 없다.
        get() = "I'm your lovely pet!"

    fun feeding() //마찬가지로 추상 메서드
    fun patting() { //일반 메서드 : 구현부를 포함하면 일반메서드로 사용가능
        println("keep patting!") // 구현부
    }
}

class Cat(override var category: String): Pet {
    override fun feeding() {
        println("Feed the cat a tuna can!")
    }
}

fun main() {
    val cat = Cat("small")
    println("Pet Category: ${cat.category}")
    cat.feeding()
    cat.patting()
}