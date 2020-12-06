package chap10.section1


fun main() {
    val input = "Kotlin"
    val keyword = "in"

    // 입력 문자열에 키워드가 있으면 인덱스를 반환하는 함수를 takeIf() 함수를 사용하여 구현
    println(input.indexOf(keyword).takeIf { it >= 0 } ?: error("Keyword not found"))

    // takeUnless() 함수를 사용하여 구현
    println(input.indexOf(keyword).takeUnless { it < 0 } ?: error("Keyword not found"))

}