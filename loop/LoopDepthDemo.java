package org.opentutorials.javatutorials.loop;

public class LoopDepthDemo {

	public static void main(String[] args) {
		// 가장 상위 for문 이 맨앞부터
		for (int i = 0; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "" + j);
                // 가장 하위 for문 이 맨뒤부터
                for (int k = 2; k < 10; k++) {
                	System.out.println(i + "" + j + "" + k);
                }
            }
        }

	}

}
