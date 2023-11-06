import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		int x1,x2,y1,y2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o x1:");
		x1 = sc.nextInt();
		System.out.println("Digite o x2:");
		x2 = sc.nextInt();
		System.out.println("Digite o y1:");
		y1 = sc.nextInt();
		System.out.println("Digite o y2:");
		y2 = sc.nextInt();
		
		double resultado = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
		
		System.out.println("Resultado: " + resultado);
		
	}

}
