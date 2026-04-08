package Practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class set4 {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("black");
		al.add("white");
		al.add("pink");
		al.add("purple");
		al.add("yellow");
		
//		for (String string : al) {
//			System.out.println(string);
//		}
		
//		System.out.println(al);
		
		al.add(0,"orange");
//		System.out.println(al);
		
//		System.out.println(al.get(3));
		
//		al.remove(3);
//		System.out.println(al);
		
//		System.out.println(al.contains("pink"));
		
//		Collections.sort(al);
//		System.out.println(al);
		
//		ArrayList<String> al1 = new ArrayList<>();
//		al1.addAll(al);
//		System.out.println(al);
//		System.out.println(al1);
		
//		Collections.shuffle(al);
//		System.out.println(al);
		
//		System.out.println(al);
//		Collections.reverse(al);
//		System.out.println(al);
		
//		List<String> alSub = al.subList(2, 4);
//		System.out.println(al);
//		System.out.println(alSub);
		
//		ArrayList<String> al1 = new ArrayList<>();
//		al1.addAll(al);
//		if( al1.equals(al)) {
//			System.out.println("Both are equal");
//		}else System.out.println("Not equal");
		
//		System.out.println("Before swap : "+al);
//		Collections.swap(al, 0, 4);
//		System.out.println("After swap : "+al);
		
//		List<Integer> li = new ArrayList<>();
//		li.add(10);
//		li.add(20);
//		li.add(30);
//		li.add(40);
//		System.out.println(li);
//		li.set(0, 5);
//		System.out.println(li);
//		for (Integer i : li) {
//			System.out.println(i);
//		}
		
//		HashSet<Integer> hs = new HashSet<>();
//		hs.add(10);
//		hs.add(40);
//		hs.add(80);
//		hs.add(50);
//		System.out.println(hs);
//		hs.add(90);
//		System.out.println(hs);
//		
//		System.out.println(hs.size());
//		
//		HashSet<Integer> hs1 = new HashSet<>();
//		hs1.add(10);
//		hs1.add(45);
//		hs1.add(80);
//		
//		System.out.println(hs1);
//		
//		for (Integer integer : hs) {
//			if( hs1.contains(integer)) {
//				System.out.println(integer);
//			}
//		}
		
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(1, "A");
		hm.put(2, "B");
		hm.put(3, "C");
		hm.put(4, "D");
		System.out.println(hm);
		
		hm.replace(2, "V");
		System.out.println(hm);
		
		System.out.println(hm.size());
		
		System.out.println(hm.isEmpty());
		
		System.out.println(hm.values());
	}
}
