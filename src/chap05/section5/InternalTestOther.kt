package chap05.section5.internal

class OtherFile {
    fun test() {
        val it = InternalTest()
        it.i = 5
        it.internalFunc()
    }
}

fun main() {
    val it = InternalTest()
    it.i = 9
    it.internalFunc()
}

