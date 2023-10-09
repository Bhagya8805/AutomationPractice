package Loops;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * for(initialization;condition;incr/decr)
		 * {  
		 * //statement or code to be executed  
		 *  }  
		 *  
		 * Initialization:	int i=0
		   step1: condition
		   step2: execute body
		   step3: incre/decre				
		   repeat step1 to 3 till the condition gets failed

		 */
		System.out.println("***************Using for loop********************");
		for(int i=1;i<=2;i++) {
			System.out.println("i: "+i+" Hello Everyone, Good Morning...");
		}
		System.out.println("***********Printing 0 to 10 number**********");
		for (int i = 0; i < 11; i++) {
			System.out.print(" "+i);
		}

	}

}
