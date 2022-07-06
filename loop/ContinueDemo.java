package org.opentutorials.javatutorials.loop;

public class ContinueDemo {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
            if (i == 5)
                continue; // continue를 만나면서 5는 넘어가서 처음으로 반복 진행
            System.out.println("Coding Everybody " + i);
        }

	}

}
