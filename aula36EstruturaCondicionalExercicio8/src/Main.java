import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();		
		double imposto;
	
		if (salario <= 2000.00) {
			System.out.println("Isento");
		}
		else if (salario > 2000.00  && salario <= 3000.00) {
			imposto = 0.08 * (salario - 2000);
			System.out.printf("R$ %.2f%n", imposto);
			
		}
		else if (salario > 3000.00  && salario <= 4500.00) {
			imposto = (0.18 * (salario - 3000)) + 1000 * 0.08;
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		else {
			imposto = (0.28 * (salario - 4500) + 1000 * 0.08) + 1500 * 0.18;
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		sc.close();
	}
}
