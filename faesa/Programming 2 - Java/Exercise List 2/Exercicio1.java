import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		/*Construa um algoritmo que leia dois números inteiros e verifique se a divisão seja indeterminada
		(denominador igual a zero). Em caso afirmativo, imprima a seguinte mensagem: “Divisão indeterminada”, do
		contrário, imprima o resultado da divisão. Considere a divisão do primeiro pelo segundo.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois números:");
		double num1 = sc.nextInt();
		double num2 = sc.nextInt();
		
		if(num2 == 0) {
			System.out.println("Divisão indeterminada");
		}
		else {
			double resultado = num1 / num2;
			System.out.println(resultado);
		}
		
	}

}
