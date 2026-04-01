package File_handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	int id;
	String name , email;
	
	public Employee(int id , String name , String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
}


public class file_handling_4 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		// serialization : 
		//FileOutputStream fout = new FileOutputStream("SerData.txt");
		//Employee emp = new Employee(1, "abc", "abc@gmail.com");
		//ObjectOutputStream os = new ObjectOutputStream(fout);
		//os.writeObject(emp);
		
		// deserialization
		FileInputStream fin = new FileInputStream("SerData.txt");
		ObjectInputStream oi = new ObjectInputStream(fin);
		Employee em = (Employee) oi.readObject();	
		
		System.out.println(em.id+" "+em.name+" "+em.email);
		
	}
}
