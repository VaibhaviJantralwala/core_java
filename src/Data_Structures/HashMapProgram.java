package Data_Structures;

import java.util.HashMap;

public class HashMapProgram {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<>();
		
//		TreeMap<Integer, String> hm = new TreeMap<>();
		
//		LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();
		
		hm.put(1, "one");
		hm.put(3, "three");
		hm.put(1, "oneee");
		hm.put(5, "five");
		hm.put(2, "two");
		hm.put(4, "four");
		
		
		System.out.println(hm);
		
		System.out.println(hm.get(4));
		
		hm.replace(2, "TWO");
		
		System.out.println(hm);
		
		System.out.println(hm.keySet());
		
		hm.put(7, "Seven");
		
		System.out.println(hm);
		
	}
}
