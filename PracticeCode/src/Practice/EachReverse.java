package Practice;

public class EachReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="bhagya shinde";
String eachreverse="";
String arr[]=str.split(" ");
for(int i=0;i<arr.length;i++) {
	eachreverse=eachreverse+" "+Getreverse(arr[i]);
}
System.out.println(eachreverse);
	}
	static String Getreverse(String ss) {
		String rev="";
		for(int i=ss.length()-1;i>=0;i--) {
			rev=rev+ss.charAt(i);
		}
		return rev;
}
}