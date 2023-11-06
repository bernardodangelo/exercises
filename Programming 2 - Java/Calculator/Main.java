import java.util.Scanner;


public class Main {

	public static void main(String[] args){
		System.out.println("-- Calculadora --");
		System.out.println("1 - Multiplicação");
		System.out.println("2 - Divisão");
		System.out.println("3 - Soma");
		System.out.println("4 - Subtração");
		System.out.println("Escolha uma dessas opções digitando o número correspondente:");
		
		Scanner sc = new Scanner(System.in);
		int escolha = sc.nextInt();
		
		System.out.println("Digite o primeiro número");
		float primeiroNumero = sc.nextInt();
		
		System.out.println("Digite o segundo número");
		float segundoNumero = sc.nextInt();
		
		if(escolha == 1){
			float multiplicacao = primeiroNumero * segundoNumero;
			System.out.println("Resultado: " + multiplicacao);
		}
		else if(escolha == 2){
			float divisao = primeiroNumero / segundoNumero;
			System.out.println("Resultado: " + divisao);
		}
		else if(escolha == 3){
			float soma = primeiroNumero + segundoNumero;
			System.out.println("Resultado: " + soma);
		}
		else if(escolha == 4){
			float subtracao = primeiroNumero - segundoNumero;
			System.out.println("Resultado:" + subtracao);
		}
		else{
			System.out.println("Opção inválida escolhida!");
		}
	}
}
