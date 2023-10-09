package Assignments;

public class EachOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EachOccurance obj=new EachOccurance();
		obj.RangeOfEvenNo(10, 20);
		IsNoPrime(29);
		obj.IsPallindrome(121);
	}	
	public void RangeOfEvenNo(int start ,int end) {
		for(;start<=end;start++) {
			if(start%2==0) {
				System.out.println(" "+start+ " ");
			}
		}
	}
	public static void IsNoPrime(int num) {

		boolean flag = false;
		for (int i = 2; i <= num / 2; ++i) {
			// condition for nonprime number
			if (num % i == 0) {
				flag = true;
				break;
			}
		}

		if (!flag)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
	}
	public static void IsPallindrome(int num)
	{
		int rem,reverse=0,org=num;
while(num!=0) {
			
			  rem=num%10;
			 reverse=reverse*10+rem;
			num=num/10;
		}
		System.out.println(reverse+" :this is the reverse");
		if(reverse==org) {
			System.out.println("is pallindrome: " +reverse);

		}
		else {
			System.out.println("is not pallindrome");
		}
	}


}

