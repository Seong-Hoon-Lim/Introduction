package org.opentutorials.javatutorials.io;

import java.util.Scanner;

public class ScannerDemo {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 사용자가 입력할 값이 저장되고, Enter 입력하는 순간 변수 i로 치환되며 실행.
        int i = sc.nextInt();
        System.out.println(i*1000);
        sc.close();
    }
 
}