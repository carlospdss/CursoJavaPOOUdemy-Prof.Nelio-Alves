import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calculadora de Soma");
		
		System.out.println("Escreva o primeiro número inteiro: ");
			int num1 = sc.nextInt();
		
		System.out.println("Escreva o segundo número inteiro: ");
			int num2 = sc.nextInt();
			
		int soma = num1 + num2;
			System.out.println("O resultado da soma é: " + soma);
			
		
		sc.close();

	}

}
