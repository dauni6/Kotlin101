package chap08.section2

//기타 배열 관련 API를 살펴보자

fun main() {
    val arr = arrayOf(1, 2, 3, 4, 5)
    println(arr.first())
    println(arr.last())

    //요소 3의 인덱스 출력
    println("indexOf(3): ${arr.indexOf(3)}") //4를 출력

    //배열의 평균 값 출력
    println("average: ${arr.average()}")

    // count에 의한 요소 개수
    println("count : ${arr.count()}")

    //존재 여부 확인
    println(arr.contains(3)) //있다면 true 반환
    println(3 in arr) //위와 동일하다.




}