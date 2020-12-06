package chap10.section1

//takeIf 와 takeUnless는 객체의 null체크에 사용된다. null검사를 빈번하게 할 경우 유용하다.

data class Ramen(val name: String?, val cost: Int?, val sell: Boolean)

private val jinramen: Ramen? = null
fun main() {
    val nuguri = Ramen("너구리", 850, true)
    
    //takeIf는 람다식이 true이면 객체를 반환하고 그렇지 않은 경우 null반환
    nuguri?.takeIf { it.sell }?.apply { checkComplete() }

}

private fun checkComplete() {
    println("널 체크 이상 없습니다.")
}