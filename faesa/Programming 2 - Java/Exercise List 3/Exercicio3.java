import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double total = 0, i = 0, num = 0;
		
		
		while(num != -1) {
			System.out.println("Digite um número qualquer ou digite -1 para sair do programa:");
			num = sc.nextDouble();
			if(num != -1) {
				total += num;
				i += 1;
			}
		}
	
		System.out.println("Média: " + total/i);
		
		sc.close();
	}	
}