package entities;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double NetSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		grossSalary += ((grossSalary * percentage) / 100) - tax;
	}
	
	public String toString() {
		return "Updated data: " + String.format("%s, $ %.2f", name, grossSalary);
	}
}
