import java.util.Scanner;


public class Exercicio3 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do piloto");
		String nome = sc.nextLine();
		System.out.println("Digite a quantidade de KM");
		float km = sc.nextFloat();
		System.out.println("Digite a quantidade de horas");
		float tempo = sc.nextFloat();
		
		float velocidade = km / tempo;
		
		
		
		System.out.println("A velocidade média de " + nome + " foi " + velocidade +  "km/h, onde " + nome + " é o nome do piloto, e " + velocidade + " é a velocidade média.");
	}

}