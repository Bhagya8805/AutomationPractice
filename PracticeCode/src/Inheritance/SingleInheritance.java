package Inheritance;

public class SingleInheritance {
	
void add()
{
	System.out.println("add from SingleInheritance");
}
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Demo obj=new Demo();
		obj.add();
		obj.mul();
	}

}
class Demo extends SingleInheritance{
	void mul() {
		System.out.println("mul from Demo");
	}
}
