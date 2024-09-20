import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		/*Faça um algoritmo que leia um número inteiro e verifique se ele é par ou ímpar. Imprima uma mensagem
correspondente ao resultado. Se o número for zero, imprima: “o valor é zero”.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		double num = sc.nextInt();
		
		if(num == 0){
			System.out.println("Zero");
		}
		else if(num % 2 == 0) {
			System.out.println("Número par");
		}
		else if(num % 2 == 1) {
			System.out.println("Número ímpar");
		}
		
		
	}
}
