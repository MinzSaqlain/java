package java_ControlStatement.com.controlstatement;

import java.util.Scanner;

public class Eg4 {

	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Employe Salary: ");
		double employeSalary= scanner.nextDouble();
		if(employeSalary==10000) {
			System.out.println("Employe salary is: "+employeSalary);
		}
		else if(employeSalary==20000) {
			System.out.println("Employe salary is: "+employeSalary);
		}
		else if(employeSalary==30000) {
			System.out.println("Employe salary is: "+employeSalary);
		}
		else if(employeSalary==40000) {
			System.out.println("Employe salary is: "+employeSalary);
		}
		else if(employeSalary==50000) {
			System.out.println("Employe salary is: "+employeSalary);
		}
		else {
			System.out.println("Employe salary is out of range");
		}
		scanner.close();

}
}
