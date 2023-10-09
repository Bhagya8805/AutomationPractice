package Singleton_Class;

public class ExampleSinglton {
	
	public static void main(String[] args) {	
		ExampleSinglton1 obj1=ExampleSinglton1.Getsinglton();
		System.out.println(obj1.age);
		System.out.println(obj1.name);
	}

}
class ExampleSinglton1{
	private ExampleSinglton1() {

	}
	static private	ExampleSinglton1 obj =new ExampleSinglton1();
	public static ExampleSinglton1 Getsinglton() {

		return obj;
	}
	int age=20;
	String name="Bhagyashri";

}

