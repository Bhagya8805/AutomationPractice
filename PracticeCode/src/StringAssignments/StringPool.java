package StringAssignments;

public class StringPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Java";  
		String s2 = "Java";  
		String s3 = new String("Java");  
	  
		System.out.println((s1 == s2)+", String are equal."); // true  
		System.out.println((s1 == s3)+", String are not equal."); // false  
		 
	}

}
