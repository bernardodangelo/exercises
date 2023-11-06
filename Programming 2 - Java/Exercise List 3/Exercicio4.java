import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int restos = 0;
		
		for(int i = 0;i<200;i++) {
			System.out.println("Digite um número");
			int num = sc.nextInt();
			restos = restos + (num % 3);
		}
		
		System.out.println("Soma dos restos: " + restos);
		
		sc.close();
	}	
}