package chap04.section02

fun main() {
    var total1: Int = 0
    var total2: Int = 0
    for (num in 1..100 step 2) total1 += num
    println("홀수 합 : $total1")

    for (num in 0..99 step 2) total2 += num
    println("짝수 합 : $total2")
}