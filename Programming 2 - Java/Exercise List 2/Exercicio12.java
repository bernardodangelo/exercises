import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o sexo (masculino ou feminino) e a idade da pessoa");
		String sexo = sc.nextLine();
		int idade = sc.nextInt();
		
		if(sexo.equals("feminino")) {
			if(idade>=18){
				System.out.println("Maior idade");
			}
			else{
				System.out.println("Menor idade");
			}
		}
		else if(sexo.equals("masculino")) {
			if(idade>=21){
				System.out.println("Maior idade");
			}
			else{
				System.out.println("Menor idade");
			}
		}
		else {
			System.out.println("Erro");
		}
		
		sc.close();
		
	}

}