package StringAssignments;
//How to reverse a string in java?
//Write a java program to reverse a given string using recursive method.
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringReverseByFor();
		String str1="Hello";
		StringBuffer str=new StringBuffer(str1);
		str.reverse();
		System.out.println(str);
		
	}
	static void StringReverseByFor() {
			String str="Bhagyashri";
			for(int i=str.length()-1;i>=0;i--) {
				System.out.print(str.charAt(i) +" ");
			}
			System.out.println();
		}
	
	
}
