import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		
		/*Fazer um programa que leia um número inteiro e mostre o seu triplo, sua metade, a sua raiz cúbica, e por
		fim, o número elevado a potência fracionária 2/3. */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro");
		double numero = sc.nextInt();
		double a = 0.75;
		
		double triplo = 3*numero;
		double metade = numero/2;
		double raiz = numero*numero*numero;
		double fracionaria = Math.pow(numero,.75);
		
		System.out.println("Resultados:");
		System.out.println(triplo);
		System.out.println(metade);
		System.out.println(raiz);
		System.out.println(fracionaria);
		
		sc.close();
	}
}
