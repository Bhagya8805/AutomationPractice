package Variables;

public class NonStaticGlobalVar {
int a=10;
int b=20;
int res=a+b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticGlobalVar obj=new NonStaticGlobalVar();
		System.out.println("number 1 is "+obj.a);
		System.out.println("number 2 is  "+obj.b);
		System.out.println(" result is "+obj.res);

	}

}
