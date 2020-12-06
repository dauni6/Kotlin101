package chap08.section2

import java.util.*

fun main() {
    val b = Array(10, {0}) //사이즈가 10이고 전부 0으로 채워넣는 배열
    println(Arrays.toString(b)) //전부 0으로 나온다.

    //배열요소를 변경하고자 한다면
    //b[0] = "Hello World" //error! 이미 정수형으로 초기화되어 있기 때문에 당연히 넣을 수 없다.
    //그러나 아래와 같은 배열 c를 생성하면 가능하다.

    val c = Array<Any>(10, {0}) //형식매개변수를 Any 타입으로 넣으면 가능해진다. 이것도 Casting하는 것 이다.
    println(c.toString())
    c[0] = "Hello World"
    println(c.toString())
    println(Arrays.toString(c))

    //그리고 b와 c는 일단 자료형과 데이터가 정해져 있지만 다시 한 번 내용이 바뀌게 되면 배열은 고정된 메모리이기 때문에
    //그 해당 메모리를 다시 복사해서 만들어 지게 된다.

    val arr1 = intArrayOf(1,2,3,4,5)
    if (6 in arr1) { // 중위표현법 in 연산자로 요소 여부 확인가능
        println("있어요")
    } else {
        println("없어요")
    }

    if (arr1.contains(4)) { //아니면 contains로 요소 여부 확인가능
        println("있어요")
    } else {
        println("없어요")
    }
    
}