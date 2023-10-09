package Loops;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Initialization:	int i=0
		   step1: condition
		   step2: execute body
		   step3: incre/decre				
		   repeat step1 to 3 till the condition gets failed
		 */
		for (int i = 0; i < 3; ++i) 
		{
			System.out.println("Hello i: " + i);
			for (int j = 0; j < 2; j++) {
				System.out.println("\thi j: " + j);
			}
		}
	}

}
