package chap03

/*
전역 변수 같은 경우에는 최상위에 있는 변수로써 프로그램이 실행되는 동안 삭제되지 않고 메모리에 유지됨
또한 여러 요소가 동시에 접근하는 경우에 잘 못된 동작을 유발하는데 이럴땐 LOCK을 하여 동기화 한 다음 해당 데이터를 보호해줘야한다
자주 사용되지 않는 전역 변수를 많이 만들시 메모리 릭이 심해진다.

지역 변수 같은 경우 특정 코드 블록 내에서만 사용가능하며 블록 시작 시 임시로 사용되고 주로 스택 메모리에 들어간다.
블록을 벗어나면 스택에서 pop되고 블록이 시작되면 push된다.

*/

var global = 10 //전역 - 패키지의 모든 범위에 적용

fun main() {
    val local1 = 20 //main 블록 내에서만 유지되고 main의 스택메모리 영역에 들어감
    val local2 = 21

    fun nestedFunc() {
        global += 1 //전역변수 global에 접근하여 +1
        val local1 = 30 //nestedFunc() 함수 블록 내에서만 유지 nestedFunc()의 상위 함수인 main함수의 local1은 가려진다. 따라서 nestedFunc()의 local1이 우선 적용됨
        println("nestedFunc local1: $local1")
        println("nestedFunc local2: $local2") //main의 local2를 사용
        println("nestedFunc global: $global")
    }

    nestedFunc() //최상위 함수
    outsideFunc() //최상위 함수
}

fun outsideFunc() { //main과 마찬가지로 최상위함수, 선언 위치와 상관없이 호출될 수 있다.
    global += 1 //전역변수인 global에 접근가능
    val outVal: String = "outside"
    println("outsideFunc global: $global")
    println("outsideFunc outVal: $outVal")
}