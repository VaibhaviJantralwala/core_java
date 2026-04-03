package Data_Structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListProgram {
		
		public static void main(String[] args) {
				
			List<Integer> arrayList = new ArrayList<Integer>();
			
//			ArrayList<Integer> al = new ArrayList<Integer>();
	
			List<Integer> al = Arrays.asList(1,2,3,4,5);
			
			arrayList.add(12);
			arrayList.add(1);
			arrayList.add(121);
			arrayList.add(2);
			
//			for(int i : arrayList) {
//				System.out.println(i);
//  		    }
//			
//			Iterator<Integer> it = al.iterator();
//			while(it.hasNext()) {
//				System.out.println(it.next());
//			}		
			
			// methods
			arrayList.addFirst(10);
			System.out.println(arrayList);
			
			arrayList.addLast(100);
			System.out.println(arrayList);
			
			System.out.println(arrayList.contains(70));
			System.out.println(arrayList.contains(2));
			
			arrayList.remove(3);
			System.out.println(arrayList);
			
			arrayList.remove(Integer.valueOf(2));
			System.out.println(arrayList);
			
			arrayList.addAll(al);
			System.out.println(arrayList);
			
			// empty array list
			// arrayList.clear();
			
			System.out.println(arrayList.size());
			
			System.out.println(arrayList.get(5));
			
			arrayList.set(6, 7);
			System.out.println(arrayList);
			
		}
}
