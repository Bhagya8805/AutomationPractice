package Assignments;

public class Practice1 {

	public static void main(String[] args) {
		Practice1 obj=new Practice1();
		obj.AddTwoint(10, 5);
		obj.AsciiOfChar('A');
		obj.EvenOdd(5);
		obj.LargestAmongThree(10, 20, 5);
		obj.LeapYear(2022);
		obj.MulFloat(10.2f, 10f);
		obj.NoPositiveNegative(-10);
		obj.SwapTwoNo(10, 5);
		obj.VovelAndConsonent('a');


	}
	public void AddTwoint(int a ,int b) {
		int c=a+b;
		System.out.println("addition of 2 int no is : "+c);
	}
	public void MulFloat(float a ,float  b) {
		float c=a+b;
		System.out.println("Multiplication of 2 float no is : "+c);
	}
	public void AsciiOfChar(char c) {
int a=c;
		System.out.println("Ascii value of char is : "+a);
	}
	public void SwapTwoNo(int a ,int b) {
		int c;
		System.out.println("original no are: "+a +" "+b);
		c=a+b;
		b=c-a;
		a=c-b;
		System.out.println("after swapping : "+a +" "+b);

	}
	public void EvenOdd(int num) {


		if(num%2==0) {
			System.out.println("No is Even : "+num);
		}
		else{
			System.out.println("No is odd : "+num);
		}
	}

	public void VovelAndConsonent(char c) {

		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			System.out.println("given char is vovel : "+c);
		}
		else{
			System.out.println("given char is consonent : "+c);
		}
	}
	public void LargestAmongThree(int a,int b,int c) {

		if(a>=b&&a>=c) {
			System.out.println("a is larger: "+a);
		}
		else if(b>=a&&b>=c) {
			System.out.println("b is larger: "+b);
		}
		else if(c>=a&&c>=b){
			System.out.println("c is larger : "+c);
		}
	}
	public void LeapYear(int Year) {


		if(Year%4==0 || Year%400==0 || Year%100==0) {
			System.out.println("Given year is leap : "+Year);
		}
		else{
			System.out.println("Given year is not leap : "+Year);
		}
	}
	public void NoPositiveNegative(int num) {


		if(num>=0) {
			System.out.println("No is positive : "+num);
		}
		else{
			System.out.println("No is negative : "+num);
		}
	}
}
