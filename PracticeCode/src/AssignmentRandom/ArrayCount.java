package AssignmentRandom;

import java.util.Arrays;

public class ArrayCount {
	// count number of digit,lowercaseletter,uppercase letter, specialCharacter in char array = {'a','2','B','q','4','F','#'};
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CountAll();
	}


	static void CountAll()
	{
		char array[] = {'a','2','B','q','4','F','#'};
		String str=Arrays.toString(array);
		System.out.println(str);
	        int upper = 0, lower = 0, number = 0, special = 0;
	 
	        for(int i = 0; i < str.length(); i++)
	        {
	            char ch = str.charAt(i);
	            if (ch >= 'A' && ch <= 'Z')
	                upper++;
	            else if (ch >= 'a' && ch <= 'z')
	                lower++;
	            else if (ch >= '0' && ch <= '9')
	                number++;
	            else
	                special++;
	        }
	 
	        System.out.println("Lower case letters : " + lower);
	        System.out.println("Upper case letters : " + upper);
	        System.out.println("Number : " + number);
	       System.out.println("Special characters : " + special);
	}
}
