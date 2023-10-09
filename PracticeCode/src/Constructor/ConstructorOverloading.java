package Constructor;

public class ConstructorOverloading {
	ConstructorOverloading() {
		System.out.print("Zero Parameterized Constructor");
		System.out.println(" having no parameters");
	}
	ConstructorOverloading(int a) {
		System.out.print("Parameterized Constructor");
		System.out.println(" having int parameters");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading obj=new ConstructorOverloading();
		ConstructorOverloading obj1=new ConstructorOverloading(10);
	}

}
