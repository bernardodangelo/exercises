import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a porcentagem do IPI:");
		int IPI = sc.nextInt();
		
		System.out.println("Digite o código da peça 1, valor unitário da peça 1, quantidade de peças 1:");
		int codigo1 = sc.nextInt();
		double valor1 = sc.nextDouble();
		int quantidade1 = sc.nextInt();
		
		System.out.println("Digite o código da peça 2, valor unitário da peça 2, quantidade de peças 2:");
		int codigo2 = sc.nextInt();
		double valor2 = sc.nextDouble();
		int quantidade2 = sc.nextInt();
		
		double formula = (valor1*quantidade1 + valor2*quantidade2)*(IPI/100 + 1);
		
		System.out.println("Fórmula: " + formula);
	
	}

}
