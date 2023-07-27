package java03_TypeCasting.com.casting;

public class Implicit {
public static void main(String[] args) {
	//in implicit we are assigning lower data type to bigger data type variable
	//bye-->short-->int-->long--> float-->double
	//				char
	byte b=10;
	short s=b;
	System.out.println(s);
	int i=s;
	System.out.println(i);
	long l=i;
	System.out.println(l);
	float f=l;
	System.out.println(f);
	
	double dd=f;
	System.out.println(dd);
	System.out.println();
	
	main();
}
public static void main() {
	
	char ch='A';
	int i=ch;
	System.out.println(i);
	long l=i;
	System.out.println(l);
	float f=l;
	System.out.println(f);
	
	double dd=f;
	System.out.println(dd);
}
}
