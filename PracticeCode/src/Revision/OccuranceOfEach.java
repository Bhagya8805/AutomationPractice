package Revision;

import java.util.HashMap;

public class OccuranceOfEach {

	public static void main(String[] args) {
		String str="bhagyashri";
	
		HashMap<Character,Integer> m1=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++) {
		
		if(m1.containsKey(str.charAt(i))) {
			int count=m1.get(str.charAt(i));
			m1.put(str.charAt(i), ++count);
		}
		else {
			m1.put(str.charAt(i), 1);
		}
	}
		System.out.println(m1);
	}

}
