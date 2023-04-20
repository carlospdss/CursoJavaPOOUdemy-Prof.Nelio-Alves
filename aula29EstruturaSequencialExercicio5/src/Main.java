import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codP1, quantP1, codP2, quantP2;
		double valP1, valP2, valTotal;
		
		 codP1 = sc.nextInt();
		 quantP1 = sc.nextInt();
		 valP1 = sc.nextDouble();
		 
		 codP2 = sc.nextInt();
		 quantP2 = sc.nextInt();
		 valP2 = sc.nextDouble();
		 
		 valTotal = quantP1 * valP1 + quantP2 * valP2;
		 System.out.printf("VALOR A PAGAR: R$ %.2f dos produtos de codigo %d e %d. %n", valTotal, codP1, codP2);
		
		
		
		sc.close();
	}

}
