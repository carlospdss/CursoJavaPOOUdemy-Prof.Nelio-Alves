import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int div = 0;
		
		for(int i=n; i>=1; i--) {
			div = n/i;
				if(n % i == 0) {
					System.out.println(div);
				}
			}
		
		sc.close();
	}
}
