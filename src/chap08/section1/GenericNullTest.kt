package chap08.section1

class GenericNull<T> { //기본적으로 null이 허용되는 형식 매개변수
    fun equalityFunc(arg1: T, arg2: T) {
        println(arg1?.equals(arg2))
    }
}

fun main() {
    val obj = GenericNull<String>() //String 이라고 넣었기때문에 non-null로 선언됨
    obj.equalityFunc("Hello", "World") //null 허용되지 않음
    
    val obj2 = GenericNull<Int?>() //null이 가능한 형식으로 선언됨
    obj2.equalityFunc(null, 10) //null 사용가능

    //null을 허용하지 않으려면 특정 자료형으로 제한하면 된다 <T: Any> 이렇게하면 null 빼고 다 된다.
}