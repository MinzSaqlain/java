package java05_Strings.com.one;

public class Eg2 {
	public static void main(String[] args) {
		//Memory Allocation
		//Strings literal
		//SCP(Strings constant pool)inside the heap area
		String s1="hello";
		String s2="hello";
		System.out.println(s1.equals(s2));
		String s5="Hello";
		System.out.println(s5);
		System.out.println(s1.equals(s5));
		
		//object stores 1 in heap area and 1 in pool area
		String s3=new String("hello");
		String s4= new String("hello");
		System.out.println(s3.equals(s4));
		String s6=new String("Hello");
		System.out.println(s6);
		System.out.println(s5.equals(s6));
		System.out.println(s3.equals(s6));
		
		//Reference comparison
		System.out.println(s1==s2);
		System.out.println(s1==s5);
		System.out.println(s3==s4);
	
}
}
