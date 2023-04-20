import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		//Char sempre colocar em aspas simples (')
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
			System.out.printf("%s, which price is $ %.2f%n", product1, price1);
			System.out.printf("%s, which price is $ %.2f%n", product2, price2);
			/* Para fazer uma linha em branco não 
			precisa escrever nada, apenas "System.out.println();" */
			System.out.println();
		
		System.out.print("Record: ");
			System.out.println(age + " years old, code " + code + " and gender: " + gender);
			System.out.println();
		
		System.out.printf("Measue with eight decimal places: %.8f%n", measure);
		
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		
		Locale.setDefault(Locale.US);
			System.out.printf("US decimal point: %.3f\n", measure);
	}

}