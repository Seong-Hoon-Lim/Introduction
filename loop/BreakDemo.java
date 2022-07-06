package org.opentutorials.javatutorials.loop;

public class BreakDemo {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
            if (i == 5)
                break; // break를 만나면서 반복종료 for 문 밖으로 탈출
            System.out.println("Coding Everybody " + i);
        }

	}

}
