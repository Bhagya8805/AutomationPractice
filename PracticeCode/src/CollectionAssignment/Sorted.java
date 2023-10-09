package CollectionAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorted {
//3. WAP to validate list is in sorted order or not (Descending / Ascending)
	public static void main(String[] args) {
		List l1=new ArrayList();
		l1.add(10);
		l1.add(5);
		l1.add(7);
		l1.add(11);
		l1.add(9);
		System.out.println(l1);
		List l2=new ArrayList();
		l2.addAll(l1);
		System.out.println(l2);
		Collections.sort(l2);
		System.out.println(l2);
		System.out.println(l1.equals(l2));

	}

}
