package AssignmentRandom;

import java.util.HashMap;
import java.util.Map;

public class EachOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Bhagyashri";
		HashMap <Character, Integer> m1 = new HashMap<>();  
		for (int i=0;i<str.length();i++)   
		{  
			if(m1.containsKey(str.charAt(i)))   
			{  
				int count = m1.get(str.charAt(i));  
				m1.put(str.charAt(i), ++count);  
			}   
			else   
			{  
				m1.put(str.charAt(i),1);  
			}  
		}  
		System.out.println(m1);  
	}  


}
