package chap07.section2.objectdestructuring

//객체를 구조화하는것을 말 그대로 structuring, 그 구제화된 객체를 분해하는것이 destructuring이다.
//주 목적은 객체가 가지고 있는 프로퍼티를 개별 변수들로 분해하기 위해 사용한다.
//즉, 객체의 프로퍼티들을 가져오는 것 이다.
//가령 얘를 들어서 cus1이라는 객체는 name, email의 프로퍼티를 가지고 있다.
//지금까지 해온 바로는 저 name 과 email을 쓰기 위해서 val name = cus1.name , val email = cus1.email
//이렇게 하는것인데 destructuring을 이용하면 아주 간단하게 작성이 가능하다. 아래에서 실제로 해보자.

private data class Customer constructor(var name: String, var eamil: String) {

    var job: String = "Unknown"
    constructor(name: String, email: String, _job: String): this(name, email) {
        job = _job
    }

    //만약 간단한 로직이 필요하다면 init{} 을 사용하면 된다.
    init{
        //로직 구현부
        this.name = "Mr/Ms." + this.name //이런식으로 가공하여 사용할 수 있다.
    }
}

fun main() {
    val cus1 = Customer("Sean", "sean@mail.com")
    //일반적인 방식
    val basicName = cus1.name
    val basicEmail = cus1.eamil
    println("$basicName and $basicEmail")

    //destructuring 방식
    val (name, email) = cus1
    println("name = $name, email = $email")

    //일반적인 방식과 비교해 봤을때, 뭐가 더 괜찮나요? 당연히 destructuring 방식이 괜찮다. 이유는 코드가 줄어들기 때문
    //만약 특정 프로퍼티를 가져올 필요가 없다면 _ 을 사용한다.
    val (_, email2) = cus1
    println(email2)

    //객체 데이터가 많은 경우 for문 활용하기
    val cus2 = Customer("Kane", "kane@mail.com")
    val cus3 = Customer("Bob", "bob@mail.com")
    val cus4 = Customer("aliey", "aliey@mail.com")

    val customers = listOf(cus1, cus2, cus3, cus4)
    for ((name, email) in customers) { //반복문을 이용한 destructuring
        println("name = $name, email = $email")
    }

    val (myName, myEmail) = myFunc() //함수를 사용해도 destructuring이 가능하다는 것.
    println("name = $myName emial = $myEmail")

    //람다식에 destructuring 사용하기
    val myLambda = { (nameLa, emailLa): Customer ->
        println("람다 $nameLa")
        println("람다 $emailLa")
    }
    myLambda(cus1)

    //components
    val n1 = cus1.component1()
    val n2 = cus1.component2()
    val n3 = cus1.job // 얘는 주생성자가 아니라서 컴포넌트로 만들어지지 않는다.

    //val (c1, c2, c3) = cus2 <-이게 안 된다. c3가 안된다. 왜냐하면 job이 주생성자가 아니라서 component가 안된다.

    val cus5 = Customer("min", "min@mail.com", "cook")
    //cus5.component3() 부생성자를 사용해도 컴포넌트3가 없다. 따라서 destructuring은 job은 안 생긴다.

}

private fun myFunc(): Customer {
    return Customer("Mickey", "mickey@mail.com")
}