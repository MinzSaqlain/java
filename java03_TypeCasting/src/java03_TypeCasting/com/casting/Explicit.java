package java03_TypeCasting.com.casting;

public class Explicit {
	public static void main(String[] args) {
		//in explicit we assign bigger  data type to lower data type 
		//double-->float-->long-->int-->short-->byte
		//                        char
		double dd=100;
		float f=(float) dd;
		System.out.println(f);
		long l=(long)f;
		System.out.println(l);
		int i=(int)l;
		System.out.println(i);
		short s=(short)i;
		System.out.println(s);
		byte b=(byte)s;
		System.out.println(b);
		System.out.println();
		Explicit ex =new Explicit();
		ex.main();
	}
	public void main() {
		char ch='b';
		short s=(short) ch;
		System.out.println(s);
		byte b=(byte)s;
		System.out.println(b);
	}

}
