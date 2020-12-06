package chap04.section01

fun main() {
    while (true) {
        try {
            var grade: Char = 'F'
            print("점수를 입력해 주세요 : ")
            val score = readLine()!!.toDouble() //콘솔로부터 입력받음

            //방법1 when 사용 단점은 grade를 계속 써야 된다는 것
           /* when(score) {
                in 90.0..100.0 -> grade = 'A'
                in 80.0..89.9 -> grade = 'B'
                in 70.0..79.9 -> grade = 'C'
                *//* 방법1 !in 사용
                !in 70.0..100.0 -> grade = 'F'*//*
                //방법2 else를 사용
                else -> grade = 'F'
            }*/
            //방법2 바로 변수에 할당
            grade = when(score) {
                in 90.0..100.0 -> 'A'
                in 80.0..89.9 -> 'B'
                in 70.0..79.9 -> 'C'
                /* 방법1 !in 사용
                    !in 70.0..100.0 -> grade = 'F'*/
                //방법2 else를 사용
                else -> 'F'
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