package chap04.section01

import java.lang.NumberFormatException

fun main() {

    while (true) {
        try {
            var grade: Char = 'F'
            print("점수를 입력해 주세요 : ")
            val score = readLine()!!.toDouble() //콘솔로부터 입력받음
            /* 기존방법
            if (score >= 90.0) {
                grade = 'A'
            } else if (score in 80.0..89.9) {
                grade = 'B'
            } else if (score >= 70.0 && score <= 79.9) {
                grade = 'C'
            } else {
                grade = 'F'
            }*/
            //변수에 바로 할당하면서 if문 사용
            grade = if (score >= 90.0) {
                'A' // 블록의 마지막이 리턴됨
            } else if (score in 80.0..89.9) {
                'B'
            } else if (score >= 70.0 && score <= 79.9) {
                'C'
            } else {
                'F'
            }
            println("점수: $score, 등급 : $grade")
            return
        } catch (e : NumberFormatException) {
            println("다시 입력해주세요")
        }
    }



}