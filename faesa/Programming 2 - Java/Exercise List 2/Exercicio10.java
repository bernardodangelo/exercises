import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 3 números:");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double num3 = sc.nextDouble();
		
		if(num1>num2) {
			if(num1>num3) {
				System.out.println("O maior número é: " + num1);
			}
		}
		else if(num2>num3) {
			System.out.println("O maior número é: " + num2);
		}
		else {
			System.out.println("O maior número é: " + num3);
		}
		
		sc.close();
		
	}

}