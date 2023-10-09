package Practice;

import java.util.Arrays;

public class DuplicateChar {

	public static void main(String[] args) {
		String str="javav";
		int n=str.length();

		for(int i = 0; i <n; i++) {  
			int  count = 1;  
			for(int j = i+1; j <n; j++) {  
				if(str.charAt(i) == str.charAt(j) && str.charAt(i) != ' ') {  
					count++;  

				}  
			}  
			//A character is considered as duplicate if count is greater than 1  
			if(count > 1 )  
				System.out.println(str.charAt(i)+ " " + count);  
		}  
	}


}

