package CollectionPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> str=new ArrayList<String>();
str.add("bhagya");
str.add("raj");
str.add("priyam");
str.add("chiu");
str.add("babu");
System.out.println(str);
str.remove(4);
System.out.println(str);

//str.removeIf(str1->str.contains("chiu"));
//str.clear();
System.out.println(str);
List<String> s1=new ArrayList<String>();
s1.add("Abc");
s1.add("XYZ");
s1.add("Pqr");
s1.add("Xyz");
System.out.println("S1 elements are: "+s1);
s1.removeIf(obj -> s1.contains("Xyz"));
System.out.println("S1 elements are: "+s1);
s1.add("Abc");
s1.add("XYZ");
s1.add("Pqr");
s1.add("Xyz");
Collections.sort(s1);
System.out.println("S1 elements are after sorting: "+s1);
Collections.reverse(s1);
System.out.println("S1 elements are after reverse: "+s1);

		
	}

}
