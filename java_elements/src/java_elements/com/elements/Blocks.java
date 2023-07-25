package java_elements.com.elements;

public class Blocks {
public static void main(String[] args) {
	new Blocks();
	
}

//Static block
static {
	int a=5;
	int b=6;
	System.out.println(a+b);
	System.out.println(a+" and "+ b);
	
}

//instance block
{
	int a=5;
	int b=6;
	System.out.println(a+b);
	System.out.println(a+" and "+ b);
}
}
