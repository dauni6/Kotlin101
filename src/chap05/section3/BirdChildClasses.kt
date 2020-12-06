package chap05.section3

open class Bird(var name: String, var wing: Int, var beak: String, var color: String) {
    //methods
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

//주 생성자를 사용하는 상속
private class Lark(name: String, wing: Int, beak: String, color: String) : Bird(name, wing, beak, color) {
    fun singHighTone() = println("Happy Song!")
}

//부 생성자를 사용하는 상속
private class Parrot : Bird {

    val language: String

    constructor(name: String,
                wing: Int,
                beak: String,
                color: String,
                language: String): super(name, wing, beak, color) {
        this.language = language
    }

    fun speak() = println("Speak! $language")
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

