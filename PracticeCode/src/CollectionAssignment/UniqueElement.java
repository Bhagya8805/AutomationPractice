package CollectionAssignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//1. WAP to get the unique elements only from the list
public class UniqueElement {

	public static void main(String[] args) {
	List l1=new ArrayList();
	l1.add(10);
	l1.add(11);
	l1.add(15);
	l1.add(15);
	l1.add(10);
	System.out.println(l1);
	Set s1=new HashSet();
	s1.addAll(l1);
	System.out.println(s1);

	}

}
