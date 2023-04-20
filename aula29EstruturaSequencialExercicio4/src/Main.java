import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int fId, horasTrab;
		double valHrs, sal;
		
		System.out.println("Número do funcionário: ");
		fId = sc.nextInt();

		System.out.println("Horas trabalhadas: ");
		horasTrab = sc.nextInt();
		
		System.out.println("Valor recebido por hora: ");
		valHrs = sc.nextDouble();
		
		sal = valHrs * horasTrab;
		
		System.out.println("NUMBER = " + fId);
		System.out.printf("SALARY: U$ %.2f%n", sal);
		
		
		sc.close();
	}

}
