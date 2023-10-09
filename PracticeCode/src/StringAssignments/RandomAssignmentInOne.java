package StringAssignments;

import java.util.Arrays;

public class RandomAssignmentInOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseString("bhagyashri");
		removeSpaceString("String str");
		findDuplicateCharString("bhagyashri");
		anagramString("strabc","abstcr") ;
		eachOccuranceInString("bhagyashri");
	}
	static void reverseString(String str) {
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}
	static void removeSpaceString(String str) {
		String temp="";
		str.trim();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(!Character.isWhitespace(ch)) {
				temp=temp+ch;
			}
		}
		System.out.println(temp);
	}
	static void findDuplicateCharString(String str) {
		for(int i=0;i<str.length();i++) {
			int count=1;
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j) && str.charAt(i)!=' ') {
					count++;
				}
			}
			if(count>1)
				System.out.println(str.charAt(i)+"  "+count);
		}
	}
	static void anagramString(String str,String str1) {
		char ch[]=str.toCharArray()	;
		char ch1[]=str.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		if(str.length()!=str1.length()) {
			System.out.println("Given Strings are not anagaram");

		}
		else {
			if(Arrays.equals(ch, ch1)==true) {
				System.out.println("Given strings are anagram");
			}
			else {
				System.out.println("Given strings are not anagram");
			}
		}
	}
	static void eachOccuranceInString(String str) {
		int totallength=str.length();
		int Eachlength=str.replaceAll("b","").length();
		int occuranceEach=totallength-Eachlength;
		System.out.println("Occurance of each character: "+occuranceEach);
	}
	static void reverseEachWord(String str) {
		String eachRev = "";

		String sarr[] = str.split(" ");
		for (int i=0; i<sarr.length;i++)
		{
		//	eachRev = (eachRev+ " "+reverseString(sarr[i]));
		}
		System.out.println(eachRev);


	}
}
