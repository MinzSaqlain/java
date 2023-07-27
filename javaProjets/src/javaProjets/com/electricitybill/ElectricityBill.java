package javaProjets.com.electricitybill;

import java.util.Scanner;

public class ElectricityBill {
	static int units;

	public static void main(String[] args) {
       double billToPay = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter ur units: ");
		
		units = scanner.nextInt();
		
		//LT - Cat1(B) I Domestic
		// If units are less than 100
		
		if (units<100) {
			billToPay = units*3.30;
			
		}
		
		// else if units are less than 200
		
		else if (units>=101 && units <=200) {
			billToPay = (100*3.30)+(units-100)*4.30;
		
		}
		
	
		//LT - Cat1(B) II Domestic
		//Units are less than 200
		
		else if(units < 200)
		{
			billToPay = units * 5;
		}
		
		//units in between 200 to 300
		
		else if(units >=201 && units <=300)
		{
			billToPay = (200*5)+(units-200)*7.20;
		}
		//units in between 301 to 400
		
		else if(units>=301 && units <=400){
			billToPay = (200*5)+(100*7.20)+(units-300)*8.50;
		}
		
		//units in between 401 to 800
		
		else if(units>=401 && units <=800){
			billToPay = (200*5)+(100*7.20)+(100*8.50)+(units-400)*9;
		}
		
		//units above 800
		
		else if(units > 800)
		{
			billToPay = (200*5)+(100*7.20)+(100*8.50)+(400*9)+(units-800)*9.5;
		}		
		
		System.out.println("Total Bill To Pay is : "+billToPay);
	}

	}


