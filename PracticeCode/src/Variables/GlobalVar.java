package Variables;

public class GlobalVar {
static int a;
float b;
static Boolean flag;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GlobalVar obj=new GlobalVar();
System.out.println("satic type int var " +a);
System.out.println("non static type float var "  +obj.b);
System.out.println("satic type boolen var " +obj.flag);
	}

}
/*
 * Local variable: variable declared inside method/constructor/block body known as local variable, 
 * 					we don;t use static keyword with local variable
 * 					these variable should be initialize before we use them
 * 					These variable won't get separate memory for storage
 * 					these variable are not accessible from outside the method/constructor body
 * Global Variable: variable declared outside the method/constructor body but present in class body
 * 					known as global variable
 * 		type:
 * 			static global variable: 
 * 			non-static global variable:
 */