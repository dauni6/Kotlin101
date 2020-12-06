package chap08.section2.arrayaccesstest

import java.util.*

fun main() {
    val arr = arrayOf(1, 2, 3, 4, 5)

    println(arr.get(1))  //게터에 의한 접근과 대괄호 연산자 표기법
    println(arr[1])//둘 다 같은 표현이지만 코틀린에서는 []를 사용한다. 인덱스를 사용한 방법
    println(arr.size)

    for (ele in arr)
        print(ele)

    println()
    println(Arrays.toString(arr)) //toString()하면 배열의 내용을 보기좋게 문자열로 표현해준다.
    println(arr.contentToString()) //이건 코틀린 방식!
    println(arr.sum()) // 다 더해줌

    arr.set(1, 8) //세터에 의한 값의 설정
    println(Arrays.toString(arr))
    arr[1] = 6 //코틀린 방식, 이게 더 보기 좋은 것 같다.
    println(Arrays.toString(arr))

    //루프를 통해 인덱스를 찾고 배열 요소에 접근하기
    for (i in arr.indices) { //indices 는 index의 복수형, 그러니 유효한 인덱스 범위를 반환한다. until로 해도 되지만, IDE에서 자동으로 indices를 추천한다.
        println("arr[$i] = ${arr[i]}")
    }
}