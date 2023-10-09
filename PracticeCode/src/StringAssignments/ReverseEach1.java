package StringAssignments;

public class ReverseEach1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="bhagyashri is my name";
String eachrev="";
String arr[]=str.split(" ");
for(int i=0;i<arr.length;i++) {
	eachrev=eachrev+" "+Getreverse(arr[i]);
}
System.out.println(Getreverse("bhagyashri name"));
System.out.println("********************************************************");
System.out.println(eachrev);
	}
	static String Getreverse(String ss) {
		String rev="";
		for(int i=ss.length()-1;i>=0;i--) {
			rev=rev+ss.charAt(i);
		}
		return rev;
		
	}

}
