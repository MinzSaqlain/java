package java_elements.com.elements;

public class StaticInstance {
	// in this we are calling both the variable in same time
	
	//instance variable
	int a=50;
	int b=60;
	
	//static variable 
	static int c=100;
	static int d=150;
	public static void main(String[] args) {
		
		//System.out.println(c);
		//System.out.println(d);
		//System.out.println(new StaticInstance().a);
		//System.out.println(new StaticInstance().b);
		StaticInstance im=new StaticInstance();
		im.m1();
		
		StaticInstance.m2();
		
	}
	public void m1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(StaticInstance.c);
		System.out.println(StaticInstance.d);
	}
   public static void m2() {
	   System.out.println(c);
		System.out.println(d);
		//in static method we only call static members
   }
}
