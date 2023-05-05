package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numero você vai digitar? ");
		int n = sc.nextInt();
		
		int[] inteiros = new int[n];
		
		for(int i = 0; i < inteiros.length; i++) {
			System.out.print("Digite um numero: ");
			inteiros[i] = sc.nextInt();
		}
		
		System.out.println("NÚMEROS NEGATIVOS: ");
		for(int i = 0; i<inteiros.length; i++) {
			if(inteiros[i] < 0) {
			System.out.printf("%d\n",inteiros[i]);
			}
		}
		sc.close();
	}

}
