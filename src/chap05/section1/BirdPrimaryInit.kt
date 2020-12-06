package chap05.section1

class InitBird(var name: String = "NONAME", var wing: Int = 2, var beak: String, var color: String) {
    //생성과 동시에 실행하려면 init을 쓴다.
    init {
        println("------초기화 블록 시작------")
        println("이름은 $name 부리는 $beak")
        this.sing(3)
        println("------초기화 블록 끝------")
    }
    
    fun fly() = println("Fly $wing")
    fun sing(vol: Int) = println("Sing $vol")
}

fun main() {
    val coco = InitBird("carl", 3, "short", "green")
    val coco2 = InitBird(wing = 4, beak = "long", color = "pink")
    println("${coco.name} ${coco.wing} ${coco.beak} ${coco.color}")
    println("${coco2.name} ${coco2.wing} ${coco2.beak} ${coco2.color}")
}