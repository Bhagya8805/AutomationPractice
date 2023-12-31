package Variables;

public class StaticGlobalVar {
	static int num1,num2=25,res;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("number 1 is " +num1);
		System.out.println("number 2 is " +num2);
		res=num1+num2;
		System.out.println("result is " +res);
	}

}
/**
any variable declared outside the method body but declared in class body known as Global variable
- if its declared with static keyword dn it will known as static global variable
- static global variables are also known as 'class variable/class member'
	- these variable will be loaded in the memory at the time of compilation when a class file if generated
	- in order access static global variable we can use-
		- we can access static global variable from another static method directly
		- standard -we can access static global variable using class name as they are class member for example:
				classname.staticglobalvariablename
- if we declare any global variable but not initialized and trying used it dn it will give you default value based on data type
- static member will have single memory allocation throughout the execution hence any change in its value will have
	impact the original value
*/