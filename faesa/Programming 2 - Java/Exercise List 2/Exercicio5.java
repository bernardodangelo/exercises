import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		
		/*Um banco concederá um crédito especial aos seus clientes, que varia com o saldo médio no último ano.
Faça um algoritmo que leia o saldo médio de um cliente e calcule o valor do crédito (percentual sobre o saldo
médio) de acordo com a tabela a seguir. Mostre uma mensagem informando o saldo médio e o valor do
crédito.
Saldo médio Percentual
Até que 200 nenhum crédito
Maior que 200 até 400 10% do valor do saldo médio
Acima de 400 20% do valor do saldo médio
*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o saldo médio");
		double saldo = sc.nextInt();
		double credito = 0;
		
		if(saldo<200) {
			credito = 0;
		}
		else if(200<saldo && saldo<400) {
			credito = saldo*1.1;
		}
		else if(400<saldo) {
			credito = saldo*1.2;
		}
		
		System.out.println("Saldo: " + saldo);
		System.out.println("Crédito: " + credito);
		
		sc.close();
		
	}

}