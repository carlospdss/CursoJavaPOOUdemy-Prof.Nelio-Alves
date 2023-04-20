import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int opcao = sc.nextInt();
		
		while(opcao != 4) {
			if(opcao == 1) {
				alcool = alcool + 1;
			}
			else if(opcao == 2) {
				gasolina = gasolina + 1;
			}
			else {
				diesel = diesel + 1;
			}
			
			opcao = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		
		
		

		
		sc.close();
	}

}
