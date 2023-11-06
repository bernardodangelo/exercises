import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double altura = -1, maiorAltura = 0, segundaMaiorAltura = 0;
		
		while(altura != 0) {
			System.out.println("Digite a altura: ");
			altura = sc.nextDouble();
			if(altura > maiorAltura) {
				segundaMaiorAltura = maiorAltura;
				maiorAltura = altura;
			}
			else if(altura > segundaMaiorAltura){
				segundaMaiorAltura = altura;
			}
		}
		
		System.out.println("Maior altura: " + maiorAltura + " Segunda Maior altura: " + segundaMaiorAltura);
		
		
		sc.close();
	}	
}