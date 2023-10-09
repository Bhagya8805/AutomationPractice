package Assignments;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getreverse(845));
		Methods.getreverse(854);
	}

	public static int getreverse(int num) {
		int rev=0,rem;
		while(num!=0) {
			rem=num%10;
			 rev=rev*10+rem;
			num=num/10;
			
			
		}
		//System.out.println(rev+ ":reverse of num");
		return rev;
	}
}
