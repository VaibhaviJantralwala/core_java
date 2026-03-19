package Java_modifiers;


class ParentClass{
	
	static class StaticClass{
		
		public StaticClass(int a){
			System.out.println(a);
		}
		
		void display() {
			System.out.println("Static display");
		}
		
		static void s_display() {
			System.out.println("Static method");
		}
	}
	
	class NonStaticClass{
		void display() {
			System.out.println("Non static method");
		}
	}
	
	
}

public class Static_modifier_nestedClass {
	
	public static void main(String[] args) {
		
		ParentClass.StaticClass p = new ParentClass.StaticClass(5);
		p.display();
		p.s_display();
		
		ParentClass p1 = new ParentClass();
		ParentClass.NonStaticClass parent = p1.new NonStaticClass();
		parent.display();
		
		
		
	}
	
}
