package chap04.section01

import java.lang.NumberFormatException

//인자를 받지 않는 경우의 when은 인자에 제한없이 다양한 변수에 대한 조건을 만들 수 있고
//비교연산자도 사용할 수 있다.
fun main() {
    while (true) {
        try {
            var grade: Char = 'F'
            print("점수를 입력해 주세요 : ")
            val score = readLine()!!.toDouble() //콘솔로부터 입력받음
            
            //인수 없는 when의 사용, 비교연산자 사용함
            when {
                score >= 90.0 -> grade = 'A'
                score in 80.0..89.9 -> grade = 'B'
                score in 70.0..79.9 -> grade = 'C'
                score < 70.0 -> grade = 'F'
            }

            val msg = when(score) {
                in 90.0..99.9, 100.0 -> "Good" //콤마로 조건을 두 개 사용할 수 있다
                else -> "Not bad"
            }

            println("점수: $score, 등급 : $grade  message : $msg")
            return
        } catch (e : NumberFormatException) {
            println("다시 입력해주세요")
        }
    }
}