package Inheritance;

public class Multilevel {
	public void add0() {
		System.out.println("non static from Multilevel");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multilevel2 obj=new Multilevel2();
		obj.add0();
		obj.add1();
		obj.add2();
		Multilevel1 obj1=new Multilevel2();
		obj1.add1();
	}

}
class Multilevel1 extends  Multilevel{
	public void add1() {
		System.out.println("non static from Multilevel1");
	}
	
}
class Multilevel2 extends  Multilevel1{
	public void add2() {
		System.out.println("non static from Multilevel2");
	}	
	public void add1() {
	super.add1();
		System.out.println("non static overrided from Multilevel2");
	}
	
	
}