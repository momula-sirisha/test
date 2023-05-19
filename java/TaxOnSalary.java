package prac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaxOnSalary {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int salary ,tax;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Salary Amount");
		salary=Integer.parseInt(reader.readLine());
		tax=(salary*12)/100;
		System.out.println("The tax on Employee Salary is " +tax);
	}

}
