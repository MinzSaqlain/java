package java07_Oops.com.Oops;
//Single level inheritance

	class Parent{
		void M1() {
			System.out.println("M1 method");
		}
	}
	
	class Child extends Parent{
		void M2() {
			System.out.println("M2 method");
		}
		
	}

public class Eg3 {
	
	public static void main(String[] args) {
		Child child= new Child();
		child.M1();
		child.M2();
		
	}
	

}
