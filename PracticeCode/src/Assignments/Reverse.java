package Assignments;

public class Reverse {

	public static void main(String[] args) {
		isPrime(8,2);
int n=2537894;
int reverse=0,k;
for(;n!=0;)
{
	k=n%10;
	reverse=reverse*10+k;
	n=n/10;
}
System.out.println(reverse);
		while(n!=0) {
			
			k=n%10;
			reverse=reverse*10+k;
			n=n/10;
		}
		System.out.println(reverse);
		
	}
static Boolean isPrime(int n,int i) {
	if(n>=1&&n<=2) {
		System.out.println("number is prime: "+n);
		return true;
	}
	else if(n%i==0) {
		System.out.println("number is not prime: "+n);
		return false;
	}
	else if(n>i*i) {
		System.out.println("number is prime: "+n);
		return true;
	}
	
	
	return isPrime( n, i+1);
}
}
