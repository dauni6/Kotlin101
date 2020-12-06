package chap08.section2.basicarray

// region Main

fun main() {
    //빈 배열 만들기
    val arrayEmpty = arrayOfNulls<Int>(5)

    //간단한 배열 만들기
    val array1 = arrayOf(1, 2, 3) //하드코딩으로 넣기
    val array2 = arrayOf(4, 5, 6)
    val array3 = arrayOf(7, 8, 9)
    
    //3x3 2차원 배열 만들기
    val arr2d = arrayOf(array1, array2, array3)
    
    //2차원 배열 출력해보기
    for (e1 in arr2d) {
        for (e2 in e1) {
            println(e2)
        }
    }
}

// endregion

// + 알아가기 Iterator란?
// 컬렉션에 저장되어 있는 요소들을 for문으로 읽어오는 방법을 표준화한 인터페이스

