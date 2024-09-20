import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		int contador = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma palavra: ");
		String palavra = sc.nextLine();
		
		palavra.toLowerCase();
		
		for(int i=0; i < palavra.length(); i++){
			char c = palavra.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
				contador++;
			}
		}
		
		System.out.println("A quantidade de vogais é igual a: " + contador);
		
		sc.close();
	}

}
