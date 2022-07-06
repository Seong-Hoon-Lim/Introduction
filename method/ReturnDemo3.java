package org.opentutorials.javatutorials.method;

public class ReturnDemo3 {
	
	//복수개의 값을 리턴하고 싶을 때는 배열을 활용
	
    public static String[] getMembers() {
        String[] members = { "최진혁", "최유빈", "한이람" };
        return members;
    }
 
    public static void main(String[] args) {
        String[] members = getMembers();
    }
 
}