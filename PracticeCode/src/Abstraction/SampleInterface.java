package Abstraction;

public interface SampleInterface {
	void add1();
	void mul();
}
class Demo implements SampleInterface{
	public static void main(String[] args) {
		Demo obj=new Demo();
		obj.add1();
		obj.mul();

	}
	public void add1() {
		System.out.println("add");

	}
	public void mul() {
		System.out.println("mul");


	}



}