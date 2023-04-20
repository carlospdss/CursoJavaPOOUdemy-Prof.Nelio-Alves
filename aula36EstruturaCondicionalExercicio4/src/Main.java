import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hrI = sc.nextInt();
		int hrF = sc.nextInt();
		
		int duracao;
		
		if (hrI < hrF) {
			duracao = hrF - hrI;
		}
		else {
			duracao = 24 - hrI + hrF;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		sc.close();
	}
}
