import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();				
		
		if (num % 2 == 0) {
			// %2 se o resto da divisão com o número 2 for 0 então é par
			System.out.println("PAR");
		}
		else {
			System.out.println("Impar");
		}
				
		sc.close();
				
	}

}
