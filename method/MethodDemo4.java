package org.opentutorials.javatutorials.method;

public class MethodDemo4 {
	
	// 2개 이상의 매개변수와 인자를 활용하는 메소드
	public static void numbering(int init, int limit) {
        int i = init;
        while (i < limit) {
            System.out.println(i);
            i++;
        }
    }
 
    public static void main(String[] args) {
        numbering(3, 5);

	}

}
