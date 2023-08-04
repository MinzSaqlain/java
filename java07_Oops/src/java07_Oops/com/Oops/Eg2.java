package java07_Oops.com.Oops;

//Every class internally extends the object class
public class Eg2 extends Object {
	
	void m1() {
		System.out.println("M1 method");
	}
	public static void main(String[] args) {
		
		//object reference
		
		Eg2 eg2= new Eg2();
		eg2.m1();
		
		//direct
		new Eg2().m1();
		
	}
}
