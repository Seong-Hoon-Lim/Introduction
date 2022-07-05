package org.opentutorials.javatutorials.condition;

public class ElseDemo {

	public static void main(String[] args) {
		if (false) {
            System.out.println(1);
        } else if (true) {
            System.out.println(2);
        } else if (true) {
            System.out.println(3);
        } else {
            System.out.println(4);
        } //결과: 2
		
		if(false){
		    System.out.println(1);
		} else if(false) {
		    System.out.println(2);
		} else if(true) {
		    System.out.println(3);
		} else {
		    System.out.println(4);
		} //결과: 3
		
		if(false){
		    System.out.println(1);
		} else if(false) {
		    System.out.println(2);
		} else if(false) {
		    System.out.println(3);
		} else {
		    System.out.println(4);
		} //결과: 4
		

	}

}
