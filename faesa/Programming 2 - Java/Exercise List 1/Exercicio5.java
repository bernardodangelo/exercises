import java.util.Scanner;


public class Exercicio5{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de graus celsius:");
		double celsius = sc.nextDouble();
		
		double resultado = (celsius * (9/5)) + 32;
		System.out.println(String.format("Temperatura em Fahrenheit: %.2f", resultado));
		
		sc.close();
		
	}
}