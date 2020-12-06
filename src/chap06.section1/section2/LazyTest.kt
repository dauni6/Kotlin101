package chap06.section1.section2

class LazyTest {
    init {
        println("init block")
    }
    
    private val subject by lazy {
        println("lazy initialized")
        "Kotlin Programing" //lazy 반환값
    }

    fun flow() {
        println("not initialized")
        println("subject one: $subject") //최초 초기화 시점
        println("subject two: $subject") //이미 초기화 된 값
    }
}

fun main() {
    val test = LazyTest() //인스턴스
    test.flow() //실행
}