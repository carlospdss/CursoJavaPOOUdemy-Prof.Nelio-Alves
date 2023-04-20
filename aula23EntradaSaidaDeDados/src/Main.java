import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Inserir nome: ");
		String nome = sc.next();

		System.out.println("Inserir idade: ");
		int idade = sc.nextInt();

		System.out.println("Inserir renda: ");
		double renda = sc.nextDouble();
		int y = 32;
		double x = 10.35784;
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.3f%n", x);
		System.out.printf("%.4f%n", x);
		System.out.println("Resultado = " + x + " METROS");
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais\n", nome, idade, renda);
		
		sc.close();
	}

}
