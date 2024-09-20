import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a distância e a velocidade do carro 1");
		double distancia1 = sc.nextDouble();
		double velocidade1 = sc.nextDouble();
		
		System.out.println("Digite a distância e a velocidade do carro 2");
		double distancia2 = sc.nextDouble();
		double velocidade2 = sc.nextDouble();
		
		System.out.println("Velocidade média carro 1: " + distancia1/velocidade1);
		System.out.println("Velocidade média carro 2: " + distancia2/velocidade2);

		if((distancia1/velocidade1)>(distancia2/velocidade2)) {
			System.out.println("O carro 1 é mais rápido");
		}
		else {
			System.out.println("O carro 2 é mais rápido");
		}
		
		sc.close();
		
	}

}