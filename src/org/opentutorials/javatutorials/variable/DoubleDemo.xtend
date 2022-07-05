package org.opentutorials.javatutorilals.variable

class DoubleDemo {
	def static void main(String[] args) {
		var double a = 1.1
		System::out.println(a + 1.1)
		// 2.2
		a = 2.1
		System::out.println(a + 1.1) // 3.2
	/* 오류발생 경우: 데이터 형식 맞지 않아 오류발생
	 * int a = 1.1; 
	 * System.out.println(a+1.1);  */
	}
}
