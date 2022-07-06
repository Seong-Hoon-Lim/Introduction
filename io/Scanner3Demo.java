package org.opentutorials.javatutorials.io;

import java.util.Scanner;
import java.io.*;
 
public class Scanner3Demo {
 
    public static void main(String[] args) {
    	// 예외처리
        try {
            File file = new File("out.txt");
            // 파일에 값을 입력 되서 변수 sc로 저장
            Scanner sc = new Scanner(file);
            while(sc.hasNextInt()) {
                System.out.println(sc.nextInt()*1000); 
            }
            sc.close();
         // 예외처리
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
         
    }
 
}