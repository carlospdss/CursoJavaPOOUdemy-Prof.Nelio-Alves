package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros você vai digitar? ");
		int n = sc.nextInt();
		
		double[] numerosReais = new double[n];
		
		for(int i = 0; i < numerosReais.length; i++) {
			System.out.print("Digite um numero: ");
			numerosReais[i] = sc.nextDouble();
		}
		
		System.out.print("Valores: ");
		for(int i = 0; i < numerosReais.length; i++) {
			System.out.printf("%.2f ", numerosReais[i]);
		}
		
		double soma = 0;
		for(int i = 0; i < numerosReais.length; i++) {
			soma += numerosReais[i];
		}
		System.out.printf("\nSOMA = %.2f%n", soma);
		
		double media = soma/numerosReais.length;
		
		System.out.printf("MEDIA: %.2f", media);
		
		sc.close();
	}
}
