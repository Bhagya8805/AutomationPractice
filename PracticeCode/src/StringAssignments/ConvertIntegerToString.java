package StringAssignments;

public class ConvertIntegerToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;  
        //1st way  
        String str = Integer.toString(x); // using Integer.toString()  
        System.out.println(str);  
   
        //2nd way  
        String str2 = String.valueOf(x); // using String.valueOf()  
        System.out.println(str2);  
  

	}

}
