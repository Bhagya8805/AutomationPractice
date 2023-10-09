package Methods;

public class StaticMethods {
	static void addNumber() {
		int num1=20,num2=30,res;
		res=num1+num2;
		System.out.println("Number1 is : "+num1);
		System.out.println("Number2 is : "+num2);
		System.out.println("Result is : "+res);
	}
	static void addTwoNumbers(int num1,int num2) {
		int res;
		res=num1+num2;
		System.out.println("Number1 is : "+num1);
		System.out.println("Number2 is : "+num2);
		System.out.println("Result is : "+res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addNumber();
		addTwoNumbers(10,20);
	}

}
