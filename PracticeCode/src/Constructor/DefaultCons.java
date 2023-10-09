package Constructor;

public class DefaultCons {

	int age=25;
	void display() {
		System.out.println("Hi, I am display method");
	}
	public static void main(String[] args) {
		
		DefaultCons c1=new DefaultCons();//calling default constructor of the current class written by java compiler
		System.out.println(c1.age);
		c1.display();
	}
}
