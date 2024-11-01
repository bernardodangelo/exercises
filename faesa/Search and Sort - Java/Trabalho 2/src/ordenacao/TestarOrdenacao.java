package ordenacao;

import java.util.Scanner;

import dados.Item;
import jdk.jshell.SourceCodeAnalysis;

public class TestarOrdenacao {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(10);
		Scanner scan = new Scanner(System.in);
		
//entrada de dados
		for (int i=0; i< 10; i++) {
			System.out.println("Digite um número inteiro: ");
			vetor.inserirDados(new Item(scan.nextInt())) ;
		}
		System.out.println("vetor desordenado\n"+vetor.toString());

//coloque aqui o metodo a ser testado
		vetor.heapSort();

//resultado
		System.out.println("\nvetor ordenado\n"+vetor.toString());
	}


}
