package Practice;

import java.util.HashMap;
import java.util.Map;

public class EachOccurance {

	public static void main(String[] args) {
		EachOccurance obj=new EachOccurance();
		obj.eachOccurance("bhagyashri");
	}
void eachOccurance(String str){
str=str.replaceAll("\\s", "");
Map<Character,Integer> m1=new HashMap<Character,Integer>();
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
