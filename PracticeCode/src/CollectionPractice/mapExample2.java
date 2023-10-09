package CollectionPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class mapExample2 {

	public static void main(String[] args) {
	Map<Integer, String> m1=new HashMap<Integer, String>();
	m1.put(10, "bhagya");
	m1.put(11, "raj");
	m1.put(12, "manju");
	m1.put(13, "chiku");
	m1.put(13, "sid");
	System.out.println(m1);
	System.out.println(m1.containsKey(101));
	System.out.println(m1.containsValue("bhagya"));
	System.out.println(m1.get(10));
	System.out.println(m1.keySet());
	System.out.println(m1.values());
	for(Entry<Integer, String> e:m1.entrySet()) {
		System.out.println(e);
	}
	}

}
