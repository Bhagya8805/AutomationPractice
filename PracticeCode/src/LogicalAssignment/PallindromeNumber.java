package LogicalAssignment;

import java.util.Scanner;

public class PallindromeNumber {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		PallindromeNumber obj=new PallindromeNumber();
		obj.pallindrome(n);
	}
	void pallindrome(int n) {
		int rem,rev=0,temp;
		temp=n;
		while(n!=0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(temp==rev) {
			System.out.println("Given no is pallindrome: "+temp);
		}
		else {
			System.out.println("Not pallindrome: "+temp);
		}
	}

}
