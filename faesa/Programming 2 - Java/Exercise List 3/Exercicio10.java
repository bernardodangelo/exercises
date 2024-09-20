import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double resultado;
		
		System.out.println("Digite o n: ");
		int n = sc.nextInt();
		System.out.println("Digite o m: ");
		int m = sc.nextInt();
		
		for(double i = 1; i < m; i++) {
			resultado = n * i;
			System.out.println(resultado);
		}
		
		sc.close();
	}	
}
