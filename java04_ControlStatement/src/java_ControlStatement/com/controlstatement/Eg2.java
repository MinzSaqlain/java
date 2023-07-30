package java_ControlStatement.com.controlstatement;

import java.util.Scanner;

public class Eg2 {
	
		public static void main(String[] args) {
	
			//without scanner class
			int age=17;
			if (age>=18) {
				System.out.println("eligible to vote");
			}
			else {
				System.out.println("not eligible to vote");
			}
			// with scanner class
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter your age");
			int customerAge=scanner.nextInt();
			if(customerAge>=18) {
				System.out.println("eligible to vote");
			}
			else {
				System.out.println("not eligible to vote");
			}
			scanner.close();
			
}
}
