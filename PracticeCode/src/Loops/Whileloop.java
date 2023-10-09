package Loops;

public class Whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		System.out.println("Printing numbers from 0 to 4");

		/*
		 * while (boolean Condition) 
		 * { 
		 * 		//code snippetů 
		 * }
		 */

		while (i < 5) {
			System.out.println("Hello " + i);
			i++;
		}

		int a=5;
		while(a>0) {
			System.out.println("bye " + a);
			a--;
		}
	}
}

/**
 * while loop execution order:
 * 		1. check condition
 * 				2. execute body
 */
