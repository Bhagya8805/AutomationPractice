package Abstraction;

public abstract class AbstractClass {
int a=100,b=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample obj=new Sample();
		obj.add();
		obj.sub();
		obj.add1();
		obj.mul();
	}
	public abstract void add();
void sub() {
	int c=a-b;
	System.out.println("substraction is: "+c);
}

}
class Sample extends AbstractClass implements SampleInterface{
public void add() {
	int c=super.a+super.b;
	System.out.println("addition is: "+c);
}
public void add1() {
	 System.out.println("add from interface SampleInterface");
	 
}
public void mul() {
	 System.out.println("mul from interface SampleInterface");

	 
}
}