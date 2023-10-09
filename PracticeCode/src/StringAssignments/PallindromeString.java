package StringAssignments;

public class PallindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="abab";
String temp=str;
String rev="";
for(int i=str.length()-1;i>=0;i--) {
	rev=rev+str.charAt(i);
}
if(temp.equals(rev)) {
	System.out.println("Given string is pallindrome");
}
else {
	System.out.println("Given string is not pallindrome");
}
	}

}
