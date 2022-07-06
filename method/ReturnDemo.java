package org.opentutorials.javatutorials.method;

public class ReturnDemo {
    public static int one() {
        return 1;
        // return 2; return 1에서 이미 종료
        // return 3; return 1에서 이미 종료
    }
 
    public static void main(String[] args) {
        System.out.println(one());
    }
}