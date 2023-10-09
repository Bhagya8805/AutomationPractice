package StringAssignments;

import java.util.Arrays;
import java.util.Scanner;

public class SortString {
	//How to count occurrences of each character in a string in java?
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getOccuringChar("bhagyashri");
	}


	static final int MAX_CHAR = 256;  
	static void getOccuringChar(String str)  
	{  
		//creating an array of size 256 (ASCII_SIZE)  
		int count[] = new int[MAX_CHAR];  
		//finds the length of the string  
		int len = str.length();  
		//initialize count array index  
		for (int i = 0; i < len; i++)  
			count[str.charAt(i)]++;  
		//create an array of given String size  
		char ch[] = new char[str.length()];  
		for (int i = 0; i < len; i++)   
		{  
			ch[i] = str.charAt(i);  
			int find = 0;  
			for (int j = 0; j <= i; j++)   
			{  
				//if any matches found  
				if (str.charAt(i) == ch[j])  
					find++;  
			}             
			if (find == 1)  
				//prints occurrence of the character   
				System.out.println("The occurrence of "+ str.charAt(i)+ " is: " + count[str.charAt(i)]);  
		}  
	}  



}
