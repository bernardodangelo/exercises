import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int matriz[][] = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		for(int i = 0; i < 3 ; i++) {
			for(int j = 0; j < 3 ; j++) {
				total = total + matriz[i][j];
			}
		}
		System.out.println(total);
		sc.close();
	}
}
