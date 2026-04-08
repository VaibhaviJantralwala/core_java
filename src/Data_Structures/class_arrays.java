package Data_Structures;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
	
	 int id;
	String name,email;
	
	
	public Student(int id,String name,String email) {
		this.id=id;
		this.email=email;
		this.name=name;
		// TODO Auto-generated constructor stub
	}
}


public class class_arrays {
public static void main(String[] args) {
	
	Student student[]=new Student[2];
	
	Scanner scn=new Scanner(System.in);
	ArrayList<Student> al=new ArrayList<>();
	for(int i=0;i<2;i++) {
		System.out.println("enter id");
		 int id=scn.nextInt();
		System.out.println("enter name");
		String name=scn.next();
		System.out.println("enter email");
		String email=scn.next();
		student[i]=new Student(id, name, email);
		al.add(student[i]);
	}
	
	//Student s1=new Student(1,"tops","tops@gmail.com");
	
	
//	for(Student s:al) {
//		System.out.println(s.id+" "+s.name+" "+s.email);
//	}
	
	//al.stream().filter(x->x.name.startsWith("a")).forEach(e->System.out.println(e.name+" "+e.id+" "+e.email));
	
	al.stream().filter(x->x.name.startsWith("a") && x.id>1).map(x->x.name+" "+x.id).forEach(System.out::println);
}
}
