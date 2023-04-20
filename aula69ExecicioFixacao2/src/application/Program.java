package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee;
		employee = new Employee();
		
		System.out.println("Name: ");
		employee.name = sc.nextLine();
		
		System.out.println("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.println("Tax: ");
		employee.tax = sc.nextDouble();
		
		
		System.out.println("Employee: " + employee);
		
		System.out.println("Which percentage to increase salary? ");
		double percent = sc.nextDouble();
		employee.increaseSalary(percent);
		
		System.out.println("Updateded data: " + employee);
		
		
		
		
		
		
		
		sc.close();
	}

}
