package LogicalAssignment;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner obj=new Scanner(System.in);
System.out.println("Enter Number you want to reverse: ");
int n=obj.nextInt();
getReverse(n);
	}
static void getReverse(int n) {
	int rem,rev=0;
	while(n!=0) {
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
		
	}
	System.out.println("reversev of given no is: "+rev);
}
}
