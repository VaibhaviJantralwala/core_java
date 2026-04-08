package Practice;

import java.util.ArrayList;
import java.util.Collections;

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
		
		Collections.sort(al);
		System.out.println(al);
		
	}
}
