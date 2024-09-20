import java.util.Scanner;


public class Exercicio4{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas foram a pizzaria?");
		int pessoas = sc.nextInt();
		System.out.println("Quantas tulipes de chope foram pedidas?");
		int chope = sc.nextInt();
		System.out.println("Quantas pizzas foram pedidas?");
		int pizza = sc.nextInt();
		System.out.println("Quantas coberturas foram pedidas?");
		int cobertura = sc.nextInt();
		
		double total = 1.1*((cobertura*3.5) + (pizza*25) + (chope*1.8));
		double totalPessoa = total/pessoas;
		
		System.out.println(String.format("Total a ser pago por pessoa: %.2f", totalPessoa));
		
		sc.close();
		
	}

}