package AssignmentsWithScanner;

import java.util.Scanner;

public class PallindromeNO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;

		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Number:");
		n=obj.nextInt();

		Ispallindrome(n);
	}
	static void Ispallindrome(int n) {
		int rem,rev=0;
		int temp=n;
		while(n!=0) {
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;

		}
		if(rev==temp) {
			System.out.println("given no is pallindrome : "+rev);
		}
		else {
			System.out.println("given no is not pallindrome");
		}
	}

}
