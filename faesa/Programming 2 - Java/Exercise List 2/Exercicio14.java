import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite caractére que identifica o consumidor:");
		System.out.println("I - Industrial");
		System.out.println("C - Comercial");
		System.out.println("R - Residencial");
		String consumidor = sc.nextLine();
		
		System.out.println("Digite a quantidade de energia consumida");
		double quantidade = sc.nextDouble();
		double valor = 0;
		
		if(consumidor.equals("I")) {
			valor = (quantidade*.68)+34;
		}
		else if(consumidor.equals("C")) {
			valor = (quantidade*.37)+45;
		}
		else if(consumidor.equals("R")) {
			valor = (quantidade*.77)-22;
		}
		
		System.out.println("Valor a ser pago: " + valor);
		
		sc.close();
		
	}

}