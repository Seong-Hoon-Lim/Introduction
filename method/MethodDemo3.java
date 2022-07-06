package org.opentutorials.javatutorials.method;

public class MethodDemo3 {

	// 매개변수와 인자를 활용하는 메소드
	public static void numbering(int limit) {
        int i = 0;
        while (i < limit) {
            System.out.println(i);
            i++;
        }
    }
 
    public static void main(String[] args) {
        numbering(5);
    }

}
