package java05_Strings.com.one;

public class Eg4 {
	public static void main(String[] args) {
		String s1="java";
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		String s2="A";
		String s3="B";
		String s4="A";
		System.out.println(s2.compareTo(s4));
		System.out.println(s3.compareTo(s2));
		System.out.println(s4.compareTo(s3));
		
		String s5="a";
		System.out.println(s5.compareToIgnoreCase(s2));
	}
}
