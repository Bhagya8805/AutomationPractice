package StringAssignments;

import java.util.Scanner;

public class StringEg {

	public static void main(String[] args) {

		StringEg sv = new StringEg();
		String s1 = "I am Vinita"; 
		int j = s1.length();
	    sv.getRev(s1);
	}

		void getRev(String s) {
		char[] x = s.toCharArray();
		for(int i =x.length-1; i>=0;i--) {
				System.out.print(x[i]);
				char[] c = new char[x.length-1];
				String str1 = String.valueOf(c);
				getRev(str1);
				
			}
			
	}


}
