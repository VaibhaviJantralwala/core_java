package Data_Structures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Admin1 implements Comparable<Admin1>{
	int id;
	String name , email;
	double salary;
	
	public Admin1(int id,String name,String email,double salary) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}

	@Override
	public int compareTo(Admin1 o) {
		// TODO Auto-generated method stub
		 if (this.salary == o.salary) {
		        return 0;
		    } else if (this.salary > o.salary) {
		        return 1;
		    } else {
		        return -1;
		    }
	}
}

public class Comparable_interface {

	
	public static void main(String[] args) {
	
		Admin1 a1 = new Admin1(0, "A", "a@mail.com", 12000.00);
		Admin1 a2 = new Admin1(4, "J", "j@mail.com", 14000.00);
		Admin1 a3 = new Admin1(3, "V", "v@mail.com", 18000.00);
		Admin1 a4 = new Admin1(1, "S", "s@mail.com", 10000.00);
		Admin1 a5 = new Admin1(2, "B", "b@mail.com", 15000.00);
		
		ArrayList<Admin1> al = new ArrayList<>();
		al.add(a1);
		al.add(a2);
		al.add(a3);
		al.add(a4);
		al.add(a5);
		
		Collections.sort(al);
		
		for(Admin1 ad  :al) {
			System.out.println(ad.id+" "+ad.name+" "+ad.email+" "+ad.salary);
		}
}
}
