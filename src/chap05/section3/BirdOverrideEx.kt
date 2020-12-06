package chap05.section3.override

//오버라이딩은 재정의. 함수 이름만 똑같고 갈아엎는 것 이다.

open class Bird(var name: String, var wing: Int, var beak: String, var color: String) {
    //methods
    fun fly() = println("Fly wing: $wing")
    open fun sing(vol: Int) = println("Sing vol: $vol") //open넣으면 오버라이드 가능
}

//주 생성자를 사용하는 상속
class Lark(name: String, wing: Int, beak: String, color: String) : Bird(name, wing, beak, color) {
    fun singHighTone() = println("Happy Song!")
}

//부 생성자를 사용하는 상속
class Parrot(name: String, wing: Int, beak: String,
             color: String, var language: String) : Bird(name, wing, beak, color) {

    private fun speak() = println("Speak! $language")
    override fun sing(vol: Int) {
        super.sing(vol) //super.sing(vol)은 재설계하되 부모의 sing을 실행시키고 재정의 부분을 실행한다는 것
        println("I'm a Parrot $vol")
        speak()
    }
}

fun main() {
    val coco = Bird("cocobird", 2, "short", "red")
    val lark = Lark("larkbird", 2, "long", "emerald")
    val parrot = Parrot("parrotbird", 2, "short", "rainbow", "korean")

    println("Coco: ${coco.name}, ${coco.wing}, ${coco.beak}, ${coco.color}")
    coco.fly()
    coco.sing(10)

    println("Lark: ${lark.name}, ${lark.wing}, ${lark.beak}, ${lark.color}")
    lark.fly()
    lark.sing(5)
    lark.singHighTone()

    println("Parrot: ${parrot.name}, ${parrot.wing}, ${parrot.beak}, ${parrot.color}, ${parrot.language}")
    parrot.fly()
    parrot.sing(15)
}