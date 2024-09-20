import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		
		System.out.println("Digite o primeiro número: ");
		int n1 = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		int n2 = sc.nextInt();
		
		if(n1>n2) {
			for(int i = n2;i <= n1; i++) {
				soma = soma + i;
			}
		}
		else {
			for(int i = n1;i <= n1; i++) {
				soma = soma + i;
			}
		}
		
		System.out.println(soma);
		
		sc.close();
	}	
}
