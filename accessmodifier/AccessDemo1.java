package org.opentutorials.javatutorials.accessmodifier;

class A {
    public String y(){
        return "public void y()";
    }
    // private 을 사용할 경우 해당 클래스 내부에서만 사용가능. 외부클래스 사용불가
    private String z(){
        return "public void z()";
    }
    public String x(){
        return z();
    }
}
public class AccessDemo1 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.y());
        // 아래 코드는 오류가 발생한다.
        //System.out.println(a.z());
        System.out.println(a.x());

	}

}