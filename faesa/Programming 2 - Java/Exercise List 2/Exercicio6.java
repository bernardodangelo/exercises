import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o código da carga e o peso em ton");
		int codigo = sc.nextInt();
		double peso = sc.nextDouble();
		
		double valor = 0;
		
		peso = peso * 1000;
		
		if(10 <= codigo && codigo <= 20) {
			valor = peso *100;
		}
		else if(21 <= codigo && codigo <= 31) {
			valor = peso *250;
		}
		else if(31 <= codigo && codigo <= 40) {
			valor = peso *330;
		}
		else {
			System.out.println("Código inválido");
		}
		
		System.out.println("O preço da carga é: " + valor);
		
		sc.close();
		
	}

}