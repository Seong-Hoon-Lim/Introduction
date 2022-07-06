package org.opentutorials.javatutorials.method;

public class ReturnDemo2 {
    public static String num(int i) {
        if(i==0){
            return "zero";
        } else if(i==1){
            return "one"; 
        } else if(i==2){
            return "two"; // else if 문에서 조건 충족되어 return "one" 에서 종료
        }
        return "none";
    }
 
    public static void main(String[] args) {
        System.out.println(num(1));
    }
}