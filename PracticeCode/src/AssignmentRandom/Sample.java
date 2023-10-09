package AssignmentRandom;

import java.util.Arrays;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String s1 = "mother in law";
		String s2 = "Hitler woman";
		int len1 = s1.replaceAll("\\s", "").length();
		int len2 = s2.replaceAll("\\s", "").length();
		System.out.println(len1);
		System.out.println(len2);
		char str1[] = s1.toLowerCase().toCharArray();
		char str2[] = s2.toLowerCase().toCharArray();
		Arrays.sort(str1);
		Arrays.sort(str2);
		for(char ch: str1) {
			System.out.print(ch);
		}
		System.out.println();
		for(char ch1: str2) {
			System.out.print(ch1);
		}
		System.out.println();

		 boolean retval = Arrays.equals(str1, str2);
	      System.out.println("arr1 and arr2 equal: " + retval);
		boolean result;
		//result=str1.equals(str2);
		//System.out.println(result);
		/*if(result== true) {
			System.out.println("Anagram");
		}
		else
		{System.out.println(" not anagram");}*/
	}



}