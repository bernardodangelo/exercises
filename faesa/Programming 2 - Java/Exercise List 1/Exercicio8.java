import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int num = sc.nextInt();
		
		System.out.println("Antecessor: " + (num-1));
		System.out.println("Sucessor: " + (num+1));
	}
}