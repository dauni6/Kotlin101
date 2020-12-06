package chap04.section02

import java.lang.NumberFormatException

fun main() {
    do {
        print("정수값을 입력해 주세요: ")
        var input = 0
        try {
            input = readLine()!!.toInt()
            for (i in 0 until input) { //until 하면 input값을 포함하지 않음. 미만의 의미
                for (j in 0 until input) print((i + j) % input + 1)
                println()
            }
        } catch (error: NumberFormatException) {
            println("정수값 이외에 입력 불가능 합니다.")
            return
        }
    } while (input != 0)
}