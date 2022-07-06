package org.opentutorials.javatutorials.object;

public class CalculatorDemo {
	 
    /* public static void main(String[] args) {
        // 아래의 로직이 1000줄 짜리의 복잡한 로직이라고 가정하자.
        System.out.println(10 + 20);
        System.out.println(20 + 40);
        */
        
	// 위 로직을 메소드화 로 만든것
    /* public static void sum(int left, int right) {
        System.out.println(left + right);
        }
     
    public static void main(String[] args) {
    	sum(10, 20);
        sum(20, 40); */
	
	// 위 로직에서 평균 구하는 메소드까지 추가
	
	public static void avg(int left, int right) {
        System.out.println((left + right) / 2);
    }
 
    public static void sum(int left, int right) {
        System.out.println(left + right);
    }
 
    public static void main(String[] args) {
        int left, right;
 
        left = 10;
        right = 20;
 
        sum(left, right);
        avg(left, right);
 
        left = 20;
        right = 40;
 
        sum(left, right);
        avg(left, right);
    }
 
}
