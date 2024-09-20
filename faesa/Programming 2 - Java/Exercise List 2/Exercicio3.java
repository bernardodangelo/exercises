import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha uma operação:");
		System.out.println("1 - [+]");
		System.out.println("2 - [-]");
		System.out.println("3 - [*]");
		System.out.println("4 - [/]");
		int escolha = sc.nextInt();
		
		System.out.println("Digite o primeiro número");
		double num1 = sc.nextInt();
		
		System.out.println("Digite o segundo número");
		double num2 = sc.nextInt();
		
		double resultado;
		switch(escolha) {
		case 1:
			resultado = num1 + num2;
			System.out.println(resultado);
			break;
		case 2:
			resultado = num1 - num2;
			System.out.println(resultado);
			break;
		case 3:
			resultado = num1 * num2;
			System.out.println(resultado);
			break;
		case 4:
			resultado = num1 / num2;
			System.out.println(resultado);
			break;
			
			
		}
	}

}
