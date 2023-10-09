package CollectionAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

//4. WAP to add list in to Queue
public class AddListIntoQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1=new ArrayList();
		l1.add(10);
		l1.add(5);
		l1.add(7);
		l1.add(11);
		l1.add(9);
		System.out.println(l1);
		Queue q1=new PriorityQueue();
		q1.addAll(l1);
		System.out.println(q1);
	}

}
