package org.opentutorials.javatutorials.variable;

public class IntergerDemo {

	public static void main(String[] args) {
		
		int a;
		a = 1;
		System.out.println(a+1); //2
		 
		a = 2;
		System.out.println(a+1); //3
		
		// 변수가 없을 경우 -> 코드 수정 시 어려움.	
		System.out.println(100 + 10);
		// 결과: 110
		System.out.println((100 + 10) / 10);
		// 결과: 11
		System.out.println(((100 + 10) / 10) - 10);
		// 결과: 1
		System.out.println((((100 + 10) / 10) - 10) * 10);
		// 결과: 10
		
		// 변수 있을 경우 -> 코드 수정 시 편리.
		int c= 100;
		System.out.println(c + 10);
		System.out.println((c+ 10) / 10);
		System.out.println(((c + 10) / 10) - 10);
		System.out.println((((c + 10) / 10) - 10) * 10);

	}

}
