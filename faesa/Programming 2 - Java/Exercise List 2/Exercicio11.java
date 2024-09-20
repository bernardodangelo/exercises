import java.util.Scanner;

public class Exercicio11 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o mês: (1-12)");
        int mes = sc.nextInt();

        System.out.print("Digite o ano: ");
        int ano = sc.nextInt();
        
        if(ano % 4 == 0) {
        	if(mes == 2) {
        		System.out.println("28");
        	}
        }
        else {
        	System.out.println("30");
        }
    }
}
