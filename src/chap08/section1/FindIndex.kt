package chap08.section1

fun <T> find(a: Array<T>, target: T): Int { //형식매개변수는 그 메서드가 호출이 될때 컴파일러에 의해서, 자료형이 추론된다.
    for(i in a.indices) { //indices 는 index의 복수형, 배열의 유효가능한 인덱스 범위를 반환
        if (a[i] == target)
            return i
    }
    return -1
}

fun main() {
    val arr1: Array<String> = arrayOf("Apple", "Banana", "Cheery", "Durian")
    val arr2: Array<Int> = arrayOf(1, 2, 3, 4)

    println("arr.indices ${arr1.indices}") //indices는 배열의 유효 범위 반환 ctrl + Q 로 알 수 있다.
    println(find<String>(arr1, "Cheery"))
    println(find(arr2, 2)) //앵글 브래킷으로 하지않아도 컴파일러가 알아서 자료형을 Int로 추론함

    println(find(arr1, "Cheery")) //이렇게도 할 수 있지만 형식매개변수를 사용하면 이럴 필요가 없다는 것.
}

//생각을해보면 좋은게, 만약 find가 String 타입을 찾고 Int타입을 찾는 함수를 이름은 갖지만 2개 만들면, 다형성에 의해서 만들어지지만
//사실 메서드가 2개 없어도 형식매개변수를 통해서 메서드 하나로 가능하다는 것.
//아래처럼 형식매개변수를 쓰지 않는다면 다형성에 의해 자료형 타입만 다르면 이렇게 2개 만들어서 사용 가능하다.
fun find(a: Array<String>, target: String): Int {
    for(i in a.indices) { //indices 는 index의 복수형
        if (a[i] == target)
            return i
    }
    return -1
}

fun find(a: Array<Int>, target: Int): Int {
    for(i in a.indices) { //indices 는 index의 복수형
        if (a[i] == target)
            return i
    }
    return -1
}
//근데 형식매개변수로 find메서드 하나만 만들면, 위에처럼 2개의 메서드로 구분해서 만들 필요가 없다는 것!!! 이것이다.

