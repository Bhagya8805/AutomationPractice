package TypeCasting;

public class TypeCastingEg {
	  double test1()
	    {
	        System.out.println("Running test1");
	        return 7;//
	    }     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypeCastingEg obj=new TypeCastingEg();
		 int res=(int)obj.test1();//
	        System.out.println("return value="+res);
	}

}
