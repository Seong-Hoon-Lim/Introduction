package org.opentutorials.javatutorials.conversion;

public class Implicit_ExplicitConversion {

	public static void main(String[] args) {
		// 암시적 형변환
		double a = 3.0F; //가능
		// float a = 3.0; //오류발생
		int b = 3;
		float c = 1.0F;
		double d = b + c;
		
		// 명시적 형변환
		// float e = 100.0; //오류발생
		// int f = 100.0F;	//오류발생
		
		float f = (float)100.0;
		int e = (int)100.0F;
	}

}
