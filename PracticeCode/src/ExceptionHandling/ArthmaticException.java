package ExceptionHandling;

public class ArthmaticException {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		Exception.getException(19);
int a=10,b,c;

try {
 c=a/0;

 try {
 }
 catch(NullPointerException B){
 
 }
}
catch(Throwable B) {
System.out.println(a);
}

finally {
	 
	System.out.println("i am finally");
	
}
	}

}
class Exception{
	static void getException(int a) {
		if(a>=18) {
			System.out.println("You are eligible:");
		}
		else{
			throw new ArithmeticException("You are not eligible:"); 
			}
	}
}
