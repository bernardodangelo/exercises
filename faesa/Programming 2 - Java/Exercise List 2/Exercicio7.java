import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu salário");
		double salario = sc.nextDouble();
		
		System.out.println("Digite seu valor de financiamento");
		double financiamento = sc.nextDouble();
		
		if(financiamento<=(5*salario)) {
			System.out.println("Financiamento concedido");
		}
		else{
			System.out.println("Financiamento negado");
		}
		System.out.println("Obrigado por nos consultar");
		
		sc.close();
		
	}

}