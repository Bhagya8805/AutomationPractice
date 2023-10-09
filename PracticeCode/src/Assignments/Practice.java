package Assignments;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="bab",reverse="";

int len=str.length();
for(int i=len-1;i>=0;--i) {
	reverse=reverse+str.charAt(i);
	
}
System.out.println(reverse);
if(reverse==str)
{
	System.out.println("pallindrme");
}
else {
	System.out.println("not");
}
	}
	}


