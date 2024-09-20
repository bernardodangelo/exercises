import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*Uma empresa concederá um aumento de salário aos seus funcionários, que varia de acordo com o cargo,
conforme a tabela. Faça um algoritmo que leia o salário e o código do cargo de um funcionário e calcule o
novo salário. Se o cargo do funcionário não estiver na tabela, ele deverá receber 5% de aumento. Imprima o
salário antigo, o novo salário e a diferença. (utilize a estrutura ESCOLHA)
Código do Cargo Percentual
101 (Gerente) 10%
102 (Engenheiro) 20%
103 (Técnico) 30%
*/
		System.out.println("Digite o código do cargo");
		int codigo = sc.nextInt();
		System.out.println("Digite o salário");
		double salario = sc.nextInt();
		
		if(codigo == 101) {
			salario = salario*1.1;
		}
		else if(codigo == 102) {
			salario = salario*1.2;
		}
		else if(codigo == 103) {
			salario = salario*1.3;
		}
		else {
			salario = salario*1.05;
		}
		
		System.out.println("Novo salário = " + salario);
		
		sc.close();
		
	}

}