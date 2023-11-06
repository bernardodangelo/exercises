import java.util.Scanner;


public class Exercicio1 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 3 valores");
		float valor1 = 2*sc.nextInt();
		float valor2 = 3*sc.nextInt();
		float valor3 = 5*sc.nextInt();
		float total = (valor1+valor2+valor3)/10;
		
		System.out.println("Média ponderada: " + total);
		
		
	}
}