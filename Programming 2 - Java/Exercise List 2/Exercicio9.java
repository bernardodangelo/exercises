import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		
		/*Faça um programa que leia o nome e idade de duas pessoas e imprima o nome da pessoa mais nova, e seu
ano de nascimento (o programa deve funcionar corretamente para qualquer que seja o ano atual)*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome e a idade da pessoa 1");
		String nome1 = sc.nextLine();
		int idade1 = sc.nextInt();
		
		System.out.println("Digite o nome e a idade da pessoa 2");
		sc.nextLine();
		String nome2 = sc.nextLine();
		int idade2 = sc.nextInt();
		
		if(idade1>idade2) {
			System.out.println("A pessoa mais velha é: " + nome1);
		}
		else {
			System.out.println("A pessoa mais velha é: " +  nome2);
		}
		
		sc.close();
		
	}

}