package org.opentutorials.javatutorials.method;

public class MethodDemo2 {
	
	// i가 10보다 작아질 때 까지 반복을 총 5번을 진행. 메소드 사용
	public static void numbering() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }
 
    public static void main(String[] args) {
        numbering();
        numbering();
        numbering();
        numbering();
        numbering();
        }
    }
