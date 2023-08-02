package java05_Strings.com.one;

public class Eg3 {
	
	public static void main(String[] args) {
	   
			//concat()
		String s1="java";
		String s2="python";
		String s3=s1.concat(s2);
		System.out.println(s3);
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1.concat(s2).concat("javascript"));
		
		String s4="javapython";
		System.out.println(s4.equals(s3));
}
}
