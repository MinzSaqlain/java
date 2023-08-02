package java05_Strings.com.one;

public class Eg1 {

	public static void main(String[] args) {
		//Strings
		//it is a sequence of character
		char s[]= {'A','D','M','I','N'};
		System.out.println(s);
		//Strings are immutable(once we create we can't modify)
		//ways to create create
		//strings literal
		String s1="admin";
		String s2="admin";
		System.out.println(s1);
		System.out.println(s2);
			
		//new keyword
		
		
		String s3=new String("hello");
		String s4=new String("hello");
		System.out.println(s3);
		System.out.println(s4 );
	}
		

}
