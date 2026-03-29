package Arrays;

class Student{
	
	int id;
	String name;
	
	public Student(int id , String name) {
		this.id = id;
		this.name = name;
		
	}
	
	public void display() {
		System.out.println("Name : "+name+" ID : "+id);
	}
}

public class ObjectArray {

	public static void main(String[] args) {
		
		Student stu[] = new Student[3];
		stu[0] = new Student(0, "sbc");
		stu[1] = new Student(1, "def");
		stu[2] = new Student(2, "xyz");
		
		for(int i=0 ; i<stu.length ; i++) {
			stu[i].display();
		}
	}
}
