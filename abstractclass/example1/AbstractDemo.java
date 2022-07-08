package org.opentutorials.javatutorials.abstractclass.example1;

abstract class A{
    public abstract int b();
    //본체가 있는 메소드는 abstract 키워드를 가질 수 없다.
    //public abstract int c(){System.out.println("Hello")}
    //추상 클래스 내에는 추상 메소드가 아닌 메소드가 존재 할 수 있다. 
    public void d(){
        System.out.println("world");
    }
}

// A 클래스로 부터 상속을 받아
// 추상 메소드인 int b() 를 오버라이딩 해서 구체적인 메소드로 재정의 하여 사용
class B extends A {
	public int b() {return 1;}

}

public class AbstractDemo {
    public static void main(String[] args) {
        // A obj = new A(); 상속 받지 못한 추상메소드 실행으로 에러가 발생됨.
    }
}
