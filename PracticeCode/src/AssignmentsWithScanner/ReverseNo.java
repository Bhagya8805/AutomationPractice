package AssignmentsWithScanner;

import java.util.Scanner;



public class ReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter No n: ");	
		n=obj.nextInt();

		ReverseNo.reverseNo(n);

	}
static void reverseNo(int n) {
	
	int rem,rev=0;
	while(n!=0) {
		rem=n%10;
		rev=(rev*10)+rem;
		n=n/10;	
	}
	System.out.println("reverse no is: "+rev);
}
}


