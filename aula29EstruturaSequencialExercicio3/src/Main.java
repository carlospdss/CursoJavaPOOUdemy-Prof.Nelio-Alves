import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, C, D, dif;
		System.out.println("Escreva o valor de A: ");
		A = sc.nextInt();
		
		System.out.println("Escreva o valor de B: ");
		B = sc.nextInt();
		
		System.out.println("Escreva o valor de C: ");
		C = sc.nextInt();
		
		System.out.println("Escreva o valor de D: ");
		D = sc.nextInt();
		
		dif = A * B - C * D;
		System.out.println("Diferença = " + dif);
		
		sc.close();
	}

}
