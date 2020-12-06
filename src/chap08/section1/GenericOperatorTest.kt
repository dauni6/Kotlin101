package chap08.section1

/*
fun <T> add(a: T, b: T): T {
    return a + b //오류! 왜? 자료형을 아직 결정할 수 없다.
}
*/

//따라서 람다식을 사용하여 연산식을 작성할 수 있음
fun <T> add(a: T, b: T, op: (T, T) -> T ): T {
    return op(a, b)
}

fun main() {
    val result = add(2,3, {a, b -> a + b})
    val result2 = add(2,3) {a, b -> a + b} //이렇게 람다식이 마지막에 있으면 표현식 밖으로 뺄 수 있음
    println(result)
}

//중요한건 형식매개변수를 사용하면, 곧바로 연산이 되지 않는다는 것.

