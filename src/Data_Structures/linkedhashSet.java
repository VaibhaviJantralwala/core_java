package Data_Structures;

import java.util.LinkedHashSet;

public class linkedhashSet {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> lh = new LinkedHashSet<>();
		lh.add(58);
		lh.add(7);
		lh.add(12);
		lh.add(20);
		lh.add(98);
		lh.add(548);
		
		System.out.println(lh);
		
		System.out.println(lh.hashCode());
		
		System.out.println(lh.reversed());
		
	}
}
