package Data_Structures;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetProgram {
	
	public HashSetProgram() {
		
		HashSet<Integer> hs = new HashSet<>();
		hs.add(123);
		hs.add(123);
		hs.add(11);
		hs.add(13);
		hs.add(1232);
		
//		for(int i : hs) {
//			System.out.println(i);
//		}	
		
		// can be print using iterator also
				Iterator<Integer> it = hs.iterator();
				while(it.hasNext()) {
					System.out.println(it.next());
				}
		
		System.out.println(hs.size());
		
		System.out.println(hs.contains(2));
		
		hs.remove(11);
		System.out.println(hs);
		
		
	}
	
	public static void main(String[] args) {
		new HashSetProgram();
	}
}
