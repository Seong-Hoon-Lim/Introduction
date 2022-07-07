package org.opentutorials.javatutorials.scope;

public class ScopeDemo {

	    static void a() {
	        int i = 0; // 지역변수 i 를 선언 {} 안에서만 적용
	    }
	 
	    public static void main(String[] args) {
	        for (int i = 0; i < 5; i++) {
	            a();
	            System.out.println(i);
	        }

	}

}
