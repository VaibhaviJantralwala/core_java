package Data_Structures;

import java.util.HashSet;

public class HashSetProgram {
	
	public HashSetProgram() {
		
		HashSet<Integer> hs = new HashSet<>();
		hs.add(123);
		hs.add(123);
		hs.add(11);
		hs.add(13);
		hs.add(1232);
		
		for(int i : hs) {
			System.out.println(i);
		}
		
	}
	
	
public static void main(String[] args) {
	new HashSetProgram();
}
}
