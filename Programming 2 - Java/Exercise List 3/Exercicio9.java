import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double s = 0;
		
		for(double i = 1; i < 50; i++) {
			s = s + 1/i;
		}

		System.out.println(s);
		
		sc.close();
	}	
}
