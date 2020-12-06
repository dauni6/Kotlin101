package chap08.section3

import java.lang.StringBuilder


fun main() {
    val a = "Hello" // 문자열
    println(a[0]) //문자열이라서 index로 확인가능하다.

    //기본적으로 문자열은 불변(immutable)값으로 생성된다.
    //위의 예시 처럼 Hello로 변수 a를 만들면
    //String pool, 또는 Heap에 고정되어 만들어 진다.
    //만약에 val b = "Hello"를 해도, 똑같은 메모리를 가리킨다.
    //따라서 문자열은 불변되기에 참조되고 있는 메모리가 변경될 수 없다.
    //var c = "Hello"로 만들면, 똑같은 메모리를 가리킨다. 그러나 c에는 다른 값을 넣을 수 있기에 새로운 메모리 공간에 할당된다.

    var s = "abcdef" // abcdef 문자열은 메모리에 고정되지만 지시자인 s는 스택에 들어 있으며 포인터가 바뀌듯 재할당 가능하다.
    s = "xyz" // 여기서 xyz를 새로 할당한다.
    //자 그럼 abcdef는 어떻게 될까? s변수의 참조만 끊길뿐 메모리에는 그대로 남아있다. 나중에 가비지컬렉터가 더 이상 참조되지 않다고 생각하면 수거해간다.
    //또한 계속해서 문자열을 재할당을 하게되면 어떻게될까? 문자열은 Heap 영역 또는 String pool에 쌓이게 되는데 그러면 메모리 부족이 생긴다.

    var word = "korea"
    println(word.substring(0..2))

    var word2 = "abcdef"
    word2 = word2.substring(0..1) + "x" + word2.substring(3 until word2.length) //재할당
    println(word2)
    //마찬가지로 word2가 abcdef를 가리키고 있는데 word2가 재할당되었지만 abcdef라는 문자열은 그대로 메모리에 남아있다. 나중에 가비지컬렉터가 수거해간다.
    //그리고 새롭게 x가 추가된 abxdef가 메모리에 올라가고 word2 변수가 해당 문자열을 메모리에서 참조하게 된다.

    val word3 = "son"
    val word4 = String(StringBuffer("son"))
    val word5 = "son"
    val word6 = String(StringBuffer("son"))

    println(word3 === word4)
    println(word3 === word5) //리터럴로 만들어진 두 변수는 같은 메모리를 가리킨다.
    println(word4 === word6)

    //a.compareTo(b)를 사용한 비교
    //a와 b가 같다면 0을 반환하고, a가 b보다 작으면 양수, 그렇지 않으면 음수를 반환한다.
    var s1 = "Hello Kotlin"
    var s2 = "Hello KOTLIN"
    println(s1.compareTo(s2))
    println(s1.compareTo(s2, true)) //true를 넣으면 대소문자를 무시한다. 그렇게되면 0을 리턴함.


    //StringBuilder 이용하기
    //문자열이 사용할 공간을 좀 더 크게 잡아 사용. 초기화된 값보다 더 크게 일정 버퍼공간을 사용한다.
    //간단한 요소 변경이 있을 경우 사용하기 좋다.
    //단, 기존의 문자열보다는 처리가 좀 느리고, 만일 단어를 변경하지 않는 경우 불필요한 메모리 낭비가 생긴다.
    //따라서 문자열이 자주 변경되는 경우에 사용된다.
    val sb = StringBuilder("Hello")
    sb[2] = 'x'

    //StringBuilder 기타 관련 메서드
    //append, insert, delete
    sb.append("World") //문자열이 뒤에 추가된다
    sb.insert(10, "Added") //인덱스 10부터 추가된다.
    sb.delete(5,10) //인덱스 5부터 10 전까지 삭제된다.

    //다시 말하지만 스트링빌더는 자주 문자열이 변경되는 경우에 사용하면 좋다
    //그렇지만 자주 변경되지않거나 대량으로 생성해버리면 메모리 낭비가 크다.

    //소문자/대문자 변경
    //toLowerCase(), toUpperCase()

    //특정 문자 단위로 잘라내기
    //split("분리문자) - 분리된 내용은 List로 반환
    var deli = "Welcome to Kotlin"
    val sp = deli.split(" ") //welcom, to, Kotlin 이렇게 3개가 들어간다.
    println(sp) //List로 반환되면 String으로 바로 출력하게끔 오버라이딩 되어있기 떄문에 toString을 할 필요가 없다.

    //tirm() 앞뒤 공백 제거
    println(" 반가워요     ".trim())


    //이스케이프 문자
   /* 
   \t :탭  \b :백스페이스
   \n :개행 \r : 리턴
   \uHHHH :유니코드 문자
   등등...
   */

    //3중 따옴표 부호 (""")의 이용하면 원본 문자열 그대로 나타낼 수 있다.
    val text= """
        |Tell me and i forget.
        |Teach me and i remember.
    """.trimIndent() //trim default는 | 파이프기호
    println(text)

}

