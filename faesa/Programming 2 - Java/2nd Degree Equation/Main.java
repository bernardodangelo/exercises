import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o a, b e c");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double raiz = Math.sqrt(Math.pow(b, 2) + (-4*a*c));
		
		double xLinha1 =(-b + raiz)/(2*a);
		double xLinha2 = (-b - raiz)/(2*a);
		
		System.out.println("Raízes da Equação de 2 grau - x' = " + xLinha1 +  " / x'' = " + xLinha2);
		
		sc.close();
	}

}
