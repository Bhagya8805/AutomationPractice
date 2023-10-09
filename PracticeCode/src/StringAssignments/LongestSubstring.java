package StringAssignments;

import java.util.Iterator;

public class LongestSubstring {

	public static void main(String[] args) {
		System.out.println(long1("abava"));
	}
	public static int long1(String str) {
		
		int max=0;
		for (int i = 0; i < str.length(); i++) {
			StringBuilder st=new StringBuilder();
			for (int j = i; j < str.length(); j++) {
				if(st.indexOf(String.valueOf(str.charAt(i)))!=-1) {
					break;
				}
				st.append(str.charAt(j));

				max=Math.max(max, st.length());

			}

		}
	
		
	return max;	
	}
}