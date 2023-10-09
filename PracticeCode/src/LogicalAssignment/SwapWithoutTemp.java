package LogicalAssignment;
//WAP swap two number without using temp variables
public class SwapWithoutTemp {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("Before swap a is: "+a);
		System.out.println("Before swap b is: "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swap a is: "+a);
		System.out.println("After swap b is: "+b);
	}

}
