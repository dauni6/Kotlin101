package chap07.section2

//Sealed클래스는 안전하게 보관하기 위해 묶어 둔 클래스 이다. sealed 키워드가 함께 쓰인다.
//sealed클래스 그 자체로는 추상 클래스와 같기 때문에 객체를 만들 순 없다.
//생성자도 기본적으로 private이며 private이 아닌 생성자는 불허한다.
//실드 클래스는 같은 파일 안에서는 상속이 가능(다른 파일에서는 상속 불가)
//블록 안에 선언되는 클래스는 상속이 필요한 경우 open 키워드로 선언한다.
//실드클래스는 주로 상태를 정의하고 관리하는데 사용된다.
//실드클래스는 조건을 제한할 수 있기 때문에 when문을 사용할 때 else가 필요 없다.


//sealed class 블록방식
sealed class Result {
    open class Success(val message: String): Result()
    class Error(val code: Int, val message: String): Result()
}

fun main() {
    val result = Result.Success("Success")
    println(eval(result))
}

//실드클래스는 조건을 제한할 수 있기 때문에 when문을 사용할 때 else가 필요 없다.
fun eval(result: Result): String = when(result) {
    is Result.Success -> result.message
    is Result.Error -> result.message
}



