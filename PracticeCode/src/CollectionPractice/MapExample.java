package CollectionPractice;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(101,"Ram");
		m1.put(102,"Ravan");
		m1.put(103,"Lanka");
		m1.put(104,"Shyam");
		m1.put(105,"Ram");
		System.out.println("Map elements : "+m1);
		m1.put(105, "Tinu");//for duplicate key you won;t get error, it will simply replace that key value with new value
		m1.put(100, "Abc");
		System.out.println("Map elements : "+m1);		
		System.out.println("All keys from map m1: "+m1.keySet());
		System.out.println("All value from map m1: "+m1.values());		
		System.out.println("Get value for key 101: "+m1.get(101));
		
		System.out.println("Element count in map: "+m1.size());
		
		/*for(Entry<Integer,String> e: m1.entrySet()) {
			System.out.println(e.getKey() + ": "+e.getValue());
		}
		*/
		Map<Integer,String> m2=new HashMap<Integer,String>();
		m2.put(106,"Ram");
		m2.put(103,"Ravan");
		m2.put(107,"Lanka");
		System.out.println("M1 elements: "+m1);
		System.out.println("M2 elements: "+m2);
		
		m1.putAll(m2);
		System.out.println("After add m2 in m1: "+m1);
		
	}
}
/*
no index
elements are stored on key-value pair
key and value both should be in form of object
key should be unique and value can be duplicate
to access any value you must have valid key
*/
	