package chap07.section1

interface Pet3 {
    public abstract var category: String //추상프로퍼티
    public abstract var species: String //추상프로퍼티

    public abstract fun feeding() //마찬가지로 추상 메서드
    fun patting() { //일반 메서드 : 구현부를 포함하면 일반메서드로 사용가능
        println("keep patting!") // 구현부
    }
}

//슈퍼 클래스
open class Animal(val name: String)

//서브 클래스
class Dog(name: String, override var category: String): Animal(name), Pet3 {
    override var species: String = "dog"
    override fun feeding() {
        println("Feed the dog a bone!")
    }
}

//서브 클래스
class Cat3(name: String, override var category: String): Animal(name), Pet3{
    override var species: String = "cat"
    override fun feeding() {
        println("Feed the cat a tuna can!")
    }
}

class Master {
    //인터페이스를 객체로 매개변수를 저장
    fun playWithPet(pet: Pet3) {
        println("Enjoy with my ${pet.species}")
    }
}

fun main() {
    val master = Master()
    val dog = Dog("Toto", "Small")
    val cat = Cat3("Coco", "BigFat")
    master.playWithPet(dog)
    master.playWithPet(cat)
}