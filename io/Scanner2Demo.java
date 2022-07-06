package org.opentutorials.javatutorials.io;

import java.util.Scanner;

public class Scanner2Demo {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 사용자가 정수값을 입력하는 동안 무한 반복되다가, 정수 외 입력 시 종료.
        while(sc.hasNextInt()) {
            System.out.println(sc.nextInt()*1000); 
        }
        System.out.println("프로그램 종료");
        sc.close();
    }
 
}
