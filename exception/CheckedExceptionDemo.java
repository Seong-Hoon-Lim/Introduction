package org.opentutorials.javatutorials.exception;
import java.io.*;

// 오류 발생
/* public class CheckedExceptionDemo {
    public static void main(String[] args) {
        try {
            BufferedReader bReader = new BufferedReader(new FileReader("out.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String input = bReader.readLine();
        System.out.println(input); 
		// TODO Auto-generated method stub */

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        BufferedReader bReader = null;
        String input = null;
        try {
            bReader = new BufferedReader(new FileReader("out.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try{
            input = bReader.readLine();
        } catch (IOException e){
            e.printStackTrace();
        }       
        System.out.println(input); 

	}

}
