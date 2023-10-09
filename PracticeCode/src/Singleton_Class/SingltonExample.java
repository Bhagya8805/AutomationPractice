package Singleton_Class;

public class SingltonExample {
	public static void main(String[] args) {
		//Selenium s2=new Selenium();
		
		Selenium s2=Selenium.getsinglton();
		System.out.println(s2.name);
		System.out.println(s2.age);
		s2.name="Rajendra";
		s2.age=30;
		System.out.println(s2.name);//
		System.out.println(s2.age);//
		
		Selenium s3=Selenium.getsinglton();
		System.out.println(s3.name);//
		System.out.println(s3.age);//
	}

}
class Selenium{
private Selenium() {
	
}
private static Selenium s1=new Selenium();
public static Selenium getsinglton() {
	return s1;
}
String name="Bhagyashri";
int age=20;
	
	
}
