import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int fatorial = 1, contador = 1;
		
		System.out.println("Digite um número: ");
		int num = sc.nextInt();
		
		for(contador = 1; contador <= num; contador++) {
			fatorial = fatorial * contador;
		}
		
		System.out.println(fatorial);
		
		
		sc.close();
	}	
}
