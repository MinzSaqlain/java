package java07_Oops.com.one.Hierarchal;

class GrandParent{
	void m1() {
		System.out.println("M1 method");
	}
}
class Parent extends GrandParent{
	void m2() {
		System.out.println("M2 method");
	}
}
class Child extends GrandParent{
	void m3() {
		System.out.println("M3 method");
	}
}

public class Eg1 {
	public static void main(String[] args) {
		
	
	Child child=new Child();
	child.m1();
	child.m3();
	
	Parent parent=new Parent();
	parent.m1();
	parent.m2();
	}
}
