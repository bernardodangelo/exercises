package Aluno;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do primeiro aluno: ");
		String nomeAluno1 = sc.nextLine();
		
		System.out.println("Digite a matrícula do primeiro aluno: ");
		int matricula1 = sc.nextInt();
		
		System.out.println("Digite a primeira nota do primeiro aluno: ");
		double aluno1Nota1 = sc.nextDouble();
		
		System.out.println("Digite a primeira nota do primeiro aluno: ");
		double aluno1Nota2 = sc.nextDouble();
		
		Aluno aluno1 = new Aluno(nomeAluno1, matricula1, aluno1Nota1, aluno1Nota2);
		
		sc.nextLine();
		
		System.out.println("Digite o nome do segundo aluno: ");
		String nomeAluno2 = sc.nextLine();
		
		System.out.println("Digite a matrícula do segundo aluno: ");
		int matricula2 = sc.nextInt();
		
		System.out.println("Digite a primeira nota do segundo aluno: ");
		double aluno2Nota1 = sc.nextDouble();
		
		System.out.println("Digite a primeira nota do segundo aluno: ");
		double aluno2Nota2 = sc.nextDouble();
		
		Aluno aluno2 = new Aluno(nomeAluno1, matricula1, aluno2Nota1, aluno2Nota2);
		
		System.out.println(aluno1.toString());
		System.out.println(aluno2.toString());
		
		
		// não funciona
		System.out.println(Aluno.compareTo(aluno1));
		
		sc.close();
		
	}
	
}
