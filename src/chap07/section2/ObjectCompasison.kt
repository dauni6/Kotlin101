package chap07.section2.objectcompasion

/*웹 할때도 공부를 했지만,
DTO라는 녀석이 있었다. 막연히 DTO DTO 하지만
acronym만 알아서는 정확히 이해하기 힘들다.
DTO는 Data Transfer Object이다. 데이터 전달을 위한 객체라는 의미이다.
따라서 구현 로직을 가지고 있지 않고 순수한 데이터 객체만 존재한다.
자바에서는 POJO(Plain Old Java Obejct)라고 불린다.
구현로직은 없고 순수 데이터만 갖고 있기 때문에 getter/setter로 접근한다.
자바의 경우에서는 직접해줘야 되지만 코틀린의 경우는 자동으로 생성된다.
데이터의 내용물을 쉽게 확인하기 위해서 toString()을 쓰고, 비교하기 위해 equals() 등과 같은
데이터 표현 및 비교 메서드를 포함한다.

자바로 DTO를 표현하면
데이터 필드들, 게터/세터들, 데이터 표현 및 비교메서드들을 모두 작성해야한다.

코틀린으로 DTO를 표현하면 프로퍼티만 신경 써서 작성해주면 나머지는 알아서 다 작동 된다.

코틀린의 데이터 클래스(data class)
DTO를 표현하기 적합한 클래스 표현으로 data class 키워드를 사용해 정의한다.

data class로 만들어지면 자동 생성되는 메서드들은
프로퍼티를 위한 게터/세터
비교를 위한 equals()와 키 사용을 위한 hashCode()
프로퍼티를 문자열로 변환해 순서대로 보여주는 toString()
객체 복사를 위한 copy()
프로퍼티에 상응하는 component1(), component2() 등이 있다. n개 만큼 componetN()이  생성된다.

데이터 클래스는 반드시 주 생성자에 최소한 하나의 매개변수를 가져야 한다.
주 생성자의 모든 매개변수는 val, var로 지정된 프로퍼티여야 한다.
데이터 클래스는 abstract, open, sealed, inner 키워드를 사용할 수 없다.

자 그런데, 여기서, data class는 구현로직은 없고 순수 데이터만 가지고 있다고했는데,
간단한 로직도 포함하면 안되는걸까? 결론부터 말하면 포함해도 된다.
부 생성자나 init 블록을 넣어 데이터를 위한 간단한 로직을 포함할 수 있다.*/

private data class Customer constructor(var name: String, var email: String)

fun main() {
    val cus1 = Customer("Sean", "sean@mail.com")
    val cus2 = Customer("Sean", "sean@mail.com")

    println(cus1 == cus2) //data class로 만들었기 때문에 같다, 그냥 class면 당연히 다르다!
    println(cus1.equals(cus2))
    println("${cus1.hashCode()} and ${cus2.hashCode()}") //마찬가지 data class이기 때문에 고유값이 같다.

    //copy 사용하기 일반 클래스는 사용불가능, data class 이기에 가능
    val cus3 = cus1.copy(name = "Alice") //name만 변경하고자 할 때
    println(cus1.name)
    println(cus3.name)
    println(cus1.toString())
    println(cus3.toString())

}