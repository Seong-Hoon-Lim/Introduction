package org.opentutorials.javatutorials.scope;

public class ScopeDemo2 {
    static int i; // 전역 변수를 선언
     
    static void a() {
        i = 0;
    }
 
    public static void main(String[] args) {
        for (i = 0; i < 5; i++) {
            a();
            System.out.println(i);
            // 0이 무한 반복됨
            
        /* for (int i = 0; i < 5; i++) {
            a();
            System.out.println(i);
            //for 문 안에 {} 서 int i 로 지역변수 선언 됨
             */
        }

	}

}
