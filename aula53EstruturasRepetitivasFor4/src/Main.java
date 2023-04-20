import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			double a = sc.nextInt();
			double b = sc.nextInt();
			double div = 0;
			
			if(b == 0) { 
				System.out.println("divisão impossivel");
			}
			else {
				div = a/b;
				System.out.printf("%.1f", div);
			}
		}
		
		
		
		
		
		
		sc.close();
	}

}
