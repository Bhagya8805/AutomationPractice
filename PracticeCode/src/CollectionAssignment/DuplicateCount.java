package CollectionAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class DuplicateCount {
	//2. WAP to get the duplicate elements count
	public static void main(String[] args) {

		List l1=new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(10);
		l1.add(10);
		l1.add(20);
		int n=l1.size();
		System.out.println(l1);
		Collections.sort(l1); 
		Collections.shuffle(l1);
		System.out.println(l1);

		for (int i = 0; i < n; i++)
		{
			int count = 1;

			// Move the index ahead whenever
			// you encounter duplicates
			while (i < n - 1 && l1.get(i) == l1.get(i+1)) {
				i++;
				count++;
				if(count==2)
				{
					System.out.println(l1.get(i) + ":duplicate elements ");

				}
			}
		}
	}
}
