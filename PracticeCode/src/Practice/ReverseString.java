package Practice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseString("bhagyashri");
		reverseStringbyBuilder("subhash");
		reverseStringbychararray("shinde");
		
	}
	static void reverseString(String str) {
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}
	static void reverseStringbyBuilder(String str) {
		StringBuilder str1=new StringBuilder(str);
		str1.reverse();
		System.out.println(str1);
		}

	static void reverseStringbychararray(String str) {
		char ch[]=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		}

}