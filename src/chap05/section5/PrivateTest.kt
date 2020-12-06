package chap05.section5

private class PrivateClass {
    private var i = 1;
    private fun privateFunc() {
        i += 1;
    }
    fun access() {
        privateFunc()
    }
}

class OtherClass {
    //val opc = PrivateClass()
    fun test() {
        val pc = PrivateClass(); //생성가능
        //pc.privateFunc() 접근불가
    }
}

fun main() {
    val pc = PrivateClass() //main이 최상위 레벨 함수라서 생성가능
    //pc.i 접근불가
    //pc.privateFunc() 접근불가
}

fun topFunction() {
    val tpc = PrivateClass() //생성가능
    //tpc.privateFunc() 접근불가
}