package CollectionPractice;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> vc1= new Vector<String>();
		vc1.add("bhagyashri");
		vc1.add("Shinde");
		vc1.add("Rajendra");
		System.out.println(vc1);
		Iterator itr=vc1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		vc1.forEach(a -> { // Here, we are using lambda expression
			System.out.println(a);
		});
		for(String str:vc1) {
			System.out.println(str);
		}
		System.out.println("Last index of Rajendra object: "+vc1.lastIndexOf("Rajendra"));
		}

}
