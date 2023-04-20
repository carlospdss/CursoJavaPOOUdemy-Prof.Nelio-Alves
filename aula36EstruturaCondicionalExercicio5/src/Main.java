import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cod = sc.nextInt();
		double quant = sc.nextDouble();
		
		double total = 0;
		
		if (cod == 1) {
			total = 4.0 * quant; 
		}
		else if (cod == 2) {
			total = 4.5 * quant;
		}
		else if (cod == 3) {
			total = 5.0 * quant;
		}
		else if (cod == 4){
			total = 2.0 * quant;
		}
		else if (cod == 5){ 
			total = 1.5 * quant;
		}
		else {
			System.out.println("CÓDIGO INVÁLIDO");
		}
		
		
		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();
		
		

	}

}
