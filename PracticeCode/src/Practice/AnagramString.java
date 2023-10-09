package Practice;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="abc avc";
String str1="abcd avc";
if(str.length()!=str1.length()) {
	System.out.println("given strings are not anagram");
}
else {
char[] ch=str.toCharArray();
char [] ch1=str1.toCharArray();
Arrays.sort(ch);
Arrays.sort(ch1);
if(Arrays.equals(ch, ch1)) {
	System.out.println("given strings are  anagram");

}
else {
	System.out.println("given strings are not anagram");

}

	}
	}
}
