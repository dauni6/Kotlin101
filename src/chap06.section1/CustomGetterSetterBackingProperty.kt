package chap06.section1.backingproperty

import chap06.section1.backingproperty.User

class User(_id: Int, _name: String, _age: Int) {
    //프로퍼티
    val id: Int = _id

    private var tempName: String? = null

    var name: String = _name
        get() {
            if (tempName == null) tempName = "NONAME"
            return tempName ?: throw AssertionError("Asserted by others")
        }
    var age: Int = _age

}

fun main() {
    val user2 = User(1, "john doe", 30)
    user2.name = "ABC"
    println("user1.name = ${user2.name}") //getter
}
