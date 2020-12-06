package chap08.section2

import java.util.*

/*
arr.sortedArray() //정렬된 배열을 반환 기본적으로 오름차순
arr.sortedArrayDescending() //내림차순으로 정렬된 배열을 반환
arr.sort()//원본 배열을 반환 ctrl + p 해보면 fromIndex가 기본값 0으로 되어있는 걸 알 수 있다.
arr.sortedDescending() //원본 배열을 내림차순으로 반환
*/

fun main() {
    val arr = arrayOf(2, 4, 8, 1, 5, 3, 7, 9, 6)

    val sortedArray = arr.sortedArray() //정렬된 배열을 반환 기본적으로 오름차순
    println(Arrays.toString(sortedArray))
    val sortedArrayDesc = arr.sortedArrayDescending() //내림차순으로 정렬된 배열을 반환
    println(sortedArrayDesc.contentToString())

    arr.sort(1, 3)
    println(Arrays.toString(arr))
    //arr.sortedDescending() //원본 배열을 내림차순으로 반환

    //List collection으로 반환
    val listSorted = arr.sorted()
    val listDesc = arr.sortedDescending()
    println("LST: $listSorted") //그런데 List의 경우 그대로 출력해도 배열을 볼 수 있도록 오버라이딩 되어 있다.
    println("LST: $listDesc")

    //SortBy를 이용하여 특정 표현식에 따른 정렬 사용
    val items = arrayOf<String>("Dog", "Cat", "Lion", "kangaroo", "Po")
    items.sortBy { item -> item.length }
    println(items.contentToString())

}