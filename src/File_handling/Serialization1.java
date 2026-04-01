package File_handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	
	int id;
	String name , mail;
	
	public Student(int id,String name,String mail) {
		this.id = id;
		this.name = name;
		this.mail = mail;
	}
}

public class Serialization1 {
public static void main(String[] args) throws IOException, ClassNotFoundException {

	Student student[] = {
		new Student(1, "abc", "abc@mail.com"),
		new Student(2, "pqr", "pqr@mail.com"),
		new Student(3, "xyz", "xyz@mail.com"),
	};
	
	//FileOutputStream fout = new FileOutputStream("SerData_Array.txt");
	//ObjectOutputStream obj = new ObjectOutputStream(fout);
	//obj.writeObject(student);
	
	FileInputStream fin = new FileInputStream("SerData_Array.txt");
	ObjectInputStream ois = new ObjectInputStream(fin);
	Student[] stu = (Student [] ) ois.readObject();
	
	for(Student s:stu) {
		System.out.println(s.name+" "+s.mail+" "+s.id);
	}
}
}
