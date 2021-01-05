package chap11.section4

var global = 20 // 공유자원

@Synchronized fun synchronizedMethod() {
    global += 1 // 값의 변경
    println("${Thread.currentThread()} global = $global")
}

fun main() {
    synchronizedMethod()
}