package Assignments;

public class Armstrom {

	public static void main(String[] args) {
		armstrom(153);
		int n=485,result=0,reminder;
		int org=n;
		while(n!=0) {
			
			reminder=n%10;
			result=(int) (result+ Math.pow(reminder, 3));
			n=n/10;
			
		}
		if(result==org) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("not");
		}
	

	}
static void armstrom(int n) {
	int rem,result=0;
	int temp=n;
	while(n!=0) {
		rem=n%10;
		result=result+rem*rem*rem;
		n=n/10;
	}
	if(result==temp) {
		System.out.println("Given no is armstrom: "+result);
	}
}
}
