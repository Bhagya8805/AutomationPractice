package Methods;

public class MethodWithVoid1 {

	/**
	 * non-static method with access modifier as default, return type as void with not parameter/argument
	 */
	void display() {
		System.out.println("I am display method");
	}
	
	static void print(char c1) {
		System.out.println("I am print method and printing char as: "+c1);
	}
	
	private void call(long num) {
		System.out.println("I am call method and calling number is: "+num);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
print('B');
MethodWithVoid1 obj=new MethodWithVoid1();
obj.call(12345);
obj.display();
	}

}