package Assignments;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumofNatural();
		Uppercase();
		 CountNoofDigits(123);
		 ReverseNumber(789); 
		 IsPallindrome(1211);
		 IsPrime(5);
		 FactorsOfpositive(5);
		 factor(-10);
		 IsArmstrong(122);
	}
	static void SumofNatural() {
		int sum=0;
		for(int i=0;i<=10;i++) {
			sum=sum+i;

		}
		System.out.println("sumof natural No is: "+sum);
	}

	static void Uppercase() {
		
		for(char c='A';c<='Z';c++) {
			System.out.print(c+" ");
		}
		System.out.println();
	}
	
	static void CountNoofDigits(int num) {
		int count=0;
		for( ;num!=0;) {
			num=num/10;
			count++;
		}
		System.out.println("No of digits in an intiger: "+count);
	}
	static void ReverseNumber(int num) {
		int rem,rev=0;
		for(;num!=0;) {
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
			
		}
		System.out.println("reverse of number: "+rev);
	}
	static void IsPallindrome(int num) {
		int rem,rev=0;
		int temp=num;
		for(;num!=0;) {
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;	
		}
		if(rev==temp) {
			System.out.println("given no is pallindrome");
		}
		else {
			System.out.println("given no is not pallindrome");
		}
		System.out.println("reverse of number: "+rev);
	}
	static void IsPrime(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%1==0 &&num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("given No is Prime: "+num);
		}
		else {
			System.out.println("given No is not Prime: "+num);
		}
		
	}
	static void FactorsOfpositive(int num) {
		int i;
		for( i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.print(i+ " ");
			}
		}
		System.out.println();
	}
	static void factor(int num) {
		if (num > 0) {
			for (int i = 1; i <= num; ++i) {
				if (num % i == 0) {
					System.out.print(i + ", ");
				}
			}
		} else {
			for (int i = num; i <= Math.abs(num); ++i) {
				if (i == 0) {
					continue;
				} else {
					if (num % i == 0) {
						System.out.print(i + ", ");
					}
				}
			}
		}
		System.out.println();
	}
	public static void IsArmstrong(int num) {
		int count=0,rem;
		int temp=num;
		int arm=0;
	while(num!=0) {
		rem=num%10;
		arm=(rem*rem*rem)+arm;
		num=num/10;
		
	}
	if(arm==temp) {
		System.out.println("given no is armstrong : "+temp  );
	}
	else {
		System.out.println("given no is not armstrong : "+temp  );
	}
	}


	}



