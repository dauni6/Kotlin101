package chap08.section2

fun main() {

    val arr = arrayOf(1, 2, 3, 4, 5)
    //forEach에 의한 요소 순환, forEach는 람다식 함수다.
    arr.forEach { element -> print("$element ") }
    //기존의 방법은 아래와 같다
    for (ele in arr) {
        print("$ele ")
    }
    println()

    //forEachIndexed에 의한 요소 순환, 인덱스와 요소를 한방에 뽑아낼 수 있다
    arr.forEachIndexed({i, e -> println("arr[$i] = $e")})

    //iterator 사용하기, 배열이 가지고 있는 멤버메서드 iterator()를 통해 새롭게 변수를 만들어 주고 사용한다.
    //iterator를 사용하여 요소 순환
    val iter = arr.iterator()
    while (iter.hasNext()) {
        val e = iter.next() //다음 요소를 반환
        print("$e ")
    }

    //그런데 지금껏 배운것중 속도 차이가 있는데
    //정수형만을 다를때는 for문을 사용, 정수형이 아니라면 순환메서드를 사용하는게 빠르다.

}