package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		grossSalary = ((percentage/100)* grossSalary) + grossSalary;
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
		/*Ao imprimir o metodo netSalary ele está chamando ao mesmo tempo ele mesmo
		Logo está fazendo o calculo de increaseSalary, que é a porcentagem 
		mais o valor de grossSalary inicial e ao refazer o metodo netSalary ele diminui a
		taxa novamente dando o valor correto.*/
	}
}
