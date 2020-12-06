package chap04.section02

fun main() {
    print("숫자를 입력해 주세요 : ")
    var number = readLine()!!.toInt() //정수값 입력받기
    var factorial: Long = 1 //1로 초기화

    while (number > 0) { // n x ... x 4 x 3 x 2 x 1
        factorial *= number
        --number
    }

    println("Factorial: $factorial")

}