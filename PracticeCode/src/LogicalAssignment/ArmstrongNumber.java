package LogicalAssignment;

public class ArmstrongNumber {
//Write a program to find whether given no. is Armstrong or not?
	public static void main(String[] args) {
		int n=13;
		int per=n;
		int rem,temp=0;
		
		while(n!=0) {
			rem=n%10;
			temp=(int) (temp+Math.pow(rem, 3));
			n=n/10;
		}
		if(temp==per) {
			System.out.println("Armstrong Number: "+per);
		}
		else {
		System.out.println("Not armstrong: "+per);
		}
	}

}
