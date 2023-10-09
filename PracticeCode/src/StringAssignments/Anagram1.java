package StringAssignments;

import java.util.Arrays;

public class Anagram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="abcf";
		String str2="abf";
		if(str1.length()!=str2.length()) {
			System.out.println("Given strings are not anagram");
		}
		else {
			char ch1[]=str1.toCharArray() ;
			char ch2[]=str2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if(Arrays.equals(ch1,ch2) == true) {  
				System.out.println("Both the strings are anagram");  
			}  
			else {  
				System.out.println("Both the strings are not anagram");  
			} 
		}
	}
}
