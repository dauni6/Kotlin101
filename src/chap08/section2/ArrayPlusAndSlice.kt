package chap08.section2

import java.util.*

fun main() {
    val arr1 = intArrayOf(1, 2, 3, 4, 5) //다섯개로 고정된 배열. 고정됐다는건 메모리에 고정됐다는 것.

    //하나의 요소를 추가한 새 배열 생성
    val arr2 = arr1.plus(6) //arr1에 하나 더 넣어서 새로운 배열이 생성.
    //이렇게 하나를 더 넣어서 생성했는데 arr1은 어떻게 될까? 그냥 메모리에 변함없이 그대로 남아 있다.
    println(Arrays.toString(arr2))
    
    //잘라내기
    //필요한 범위를 잘라내 새 배열 생성
    val arr3 = arr1.slice(0..2)// 인자에 잘라낼 인덱스의 범위를 지정
    println(Arrays.toString(arr3.toIntArray()))
    //이렇게 잘라내도 arr1은 변함이 없다. 왜? arr2, arr3를 만들때 배열을 복사한 뒤 넣어주기 때문에 원래의 arr1은 건드리지 않기 때문이다.
}