package AssignmentsWithScanner;

import java.util.Scanner;

public class Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter No : ");	
		number=obj.nextInt();
		RangeOfEvenNo(number);


	}	

	static void RangeOfEvenNo(int number) {
		System.out.print("even numbers from 1 to "+number+": ");  

		for (int i=1; i<=number; i++)   
		{  

			if (i%2==0)   
			{  
				System.out.print(i + " ");  
			}  

		}
	}
}
