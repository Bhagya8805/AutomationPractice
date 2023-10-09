package AssignmentRandom;

import java.util.Arrays;

//. percentage of digit,lowercaseletter,uppercase, special symbol letter in char array = {'a','2','B','q','4','F'}; 
public class PercantageEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char array[] = {'a','2','B','q','4','F'}; 
		String str=Arrays.toString(array);
		int n=str.length();
		double upper = 0, lower = 0, number = 0, special = 0;
		double upperpercantage = 0, lowerpercantage = 0, numberpercantage = 0, specialpercantage = 0;
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z') {
				upper++;
			}
			else if(ch>='a'&&ch<='z') {
				lower++; 
			}
			else if(ch>='0'&&ch<='9') {
				number++;
			}
			else{
				special++;
			}
		}
		upperpercantage= (upper * 100) / n ;
		lowerpercantage=(lower*100)/n;
		numberpercantage=(number*100)/n;
		specialpercantage=(special*100)/n;
         
        System.out.println("Uppercase letters are " + (upperpercantage) + "% ");  
        System.out.println("Lowercase letters are " + (lowerpercantage) + "%");  
        System.out.println("Digits Are " + (numberpercantage) + "%");  
        System.out.println("Other Characters Are " +(specialpercantage) + "%");  
   

	}

}
