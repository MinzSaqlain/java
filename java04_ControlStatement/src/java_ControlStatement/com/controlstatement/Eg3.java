package java_ControlStatement.com.controlstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eg3 {

	public static void main(String[] args)throws IOException {
		//BfferedReader
		// BufferedReader is a class
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your age:");
		String userAge=reader.readLine();
		int age=Integer.parseInt(userAge);
		if(age>=18) {
			System.out.println("you can vote");
		}
		else {
			System.out.println("you can't vote");
		}

	}

}
