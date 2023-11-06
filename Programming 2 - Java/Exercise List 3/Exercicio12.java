import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double altura, qntM = 0, qntH = 0, qntAlturaH170 = 0, qntAlturaM = 0;
		char sexo;
		
		System.out.println("Digite a quantidade de pessoas a serem medidas: ");
		int pessoas = sc.nextInt();
		
		for(int i = 0;i < pessoas;i++) {
			
			System.out.println("Digite o sexo (m ou h) e digite a altura da pessoa: ");
			sexo = sc.next().charAt(0);
			altura = sc.nextDouble();
			
			if(sexo == 'm') {
				qntAlturaM = qntAlturaM + altura;
				qntM++;
			}
			else if(sexo == 'h'){
				if(altura > 1.70) {
					qntAlturaH170 = qntAlturaH170 + 1;
				}
				qntH++;
			}
			else {
				System.out.println("Erro");
				System.exit(1);
			}
		}
		
		System.out.println("Homens que foram medidos: " + qntH);
		System.out.println("Mulheres que foram medidas: " + qntM);
		System.out.println("Quantidade de homens acima de 1,70: " + qntAlturaH170);
		System.out.println("Média das alturas das mulheres: " + (qntAlturaM/qntM));
		
		sc.close();
	}	
}
