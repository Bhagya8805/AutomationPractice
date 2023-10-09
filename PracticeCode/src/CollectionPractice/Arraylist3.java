package CollectionPractice;

import java.util.ArrayList;

public class Arraylist3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Is ArrayList Empty: "+al.isEmpty());  
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		al.add("Hanumat");
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Ravi");
		al2.add("Hanumat");
		al2.add(new String("Pune"));
		System.out.println("al list elements: "+al);
		System.out.println("al2 list elements: "+al2);
		
		al.retainAll(al2);
		System.out.println("al list after retailAll(): "+al);
	}

}
