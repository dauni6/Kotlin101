package chap10.section1

fun main() {
    var score: Int? = 32
    score = null

    fun checkScore() {
        if (score != null) {
            println("score : $score")
        }
    }

    fun checkScoreLet() {
        score?.let { println("score: $it") }
        val str = score?.let { it.toString() }
        println(str)
    }

    checkScore()
    checkScoreLet()

}