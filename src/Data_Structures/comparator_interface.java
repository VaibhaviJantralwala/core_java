package Data_Structures;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Admin {
	int id;
	String name , email;
	double salary;
	
	public Admin(int id,String name,String email,double salary) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}
}

class IDsort implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		Admin a1 = (Admin)o1;
		Admin a2 = (Admin)o2;
		
		// TODO Auto-generated method stub
		
		if( a1.id == a2.id ) {
			return 0;
		}
		else if( a1.id > a2.id ) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
}

class Namesort implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		Admin a1 = (Admin)o1;
		Admin a2 = (Admin)o2;
		
		// TODO Auto-generated method stub
		
		return a1.name.compareTo(a2.name);
	}
	
}

public class comparator_interface {

	public static void main(String[] args) {
		
		Admin a1 = new Admin(0, "A", "a@mail.com", 12000.00);
		Admin a2 = new Admin(4, "J", "j@mail.com", 14000.00);
		Admin a3 = new Admin(3, "V", "v@mail.com", 18000.00);
		Admin a4 = new Admin(1, "S", "s@mail.com", 10000.00);
		Admin a5 = new Admin(2, "B", "b@mail.com", 15000.00);
		
		ArrayList<Admin> al = new ArrayList<>();
		al.add(a1);
		al.add(a2);
		al.add(a3);
		al.add(a4);
		al.add(a5);
		
		System.out.println("ID vise sorting ---");
		
		Collections.sort(al, new IDsort());
		
		for(Admin ad  :al) {
			System.out.println(ad.id+" "+ad.name+" "+ad.email+" "+ad.salary);
		}
		
		System.out.println("Name vise sorting ---");
		
		Collections.sort(al, new Namesort());
		
		for(Admin ad  :al) {
			System.out.println(ad.id+" "+ad.name+" "+ad.email+" "+ad.salary);
		}
		
		
	}
}
