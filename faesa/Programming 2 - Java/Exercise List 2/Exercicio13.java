import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantas hastes de cobre foram vendidas");
		int cobre = sc.nextInt();
		System.out.println("Digite quantas hastes de aluminio foram vendidas");
		int aluminio = sc.nextInt();
		int total = aluminio + cobre;
		
		double preco = (aluminio*4)+(cobre*2);
		
		if(5<total && total<15) {
			preco = preco*.90;
		}
		if(16<total && total<20) {
			preco = preco*.85;
		}
		if(20<total) {
			preco = preco*.80;
		}
		
		System.out.println("Preço: " + preco);
		
		sc.close();
		
	}

}