package chap07.section1;

interface Pet2 {
    String category = "small"; //코틀린과 다르게 멤버편수에 초기화가 가능. 그러나 코틀린 인터페이스에는 기본적으로 인터페이스에 프로퍼티 초기화가 안된다.
    void feeding(); //추상 메서드
    default void patting(){ //자바8부터 default 키워드로 일반 메서드 사용 가능
        System.out.println("keep patting!");
    }
}

class Cat2 implements Pet2{

    String category = null;

    public Cat2(String _category) {
       this.category = _category;
    }

    @Override
    public void feeding() {
        System.out.println("Feed the cat a tuna can!");
    }

    public static void main(String[] args) {
        Cat2 cat2 = new Cat2("small");

        System.out.println("Pet Category " + cat2.category);
        cat2.feeding();
        cat2.patting();
    }
}


