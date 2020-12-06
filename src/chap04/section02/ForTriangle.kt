package chap04.section02

import java.lang.NumberFormatException

fun main() {

    while (true) {
        try {
            print("줄 수를 입력해주세요 : ")
            val n = readLine()!!.toInt() //콘솔로부터 입력받음
            for (line in 1..n) {
                for (space in 1..(n - line)) print(" ") //공백출력
                for (star in 1..(2 * line - 1)) print("*") //별표 출력, until로 표현가능, until은 마지막 범위 포함 안함
                println() //개행
            }
            return
        } catch (error : NumberFormatException) {
            println("정수형 숫자만 입력가능 합니다.")
        }

    }


}