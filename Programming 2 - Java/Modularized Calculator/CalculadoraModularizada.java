import java.util.Scanner;


public class CalculadoraModularizada {
	static Scanner entrada = new Scanner(System.in);
	static double num1, num2, resultado=0;


	public static void main(String args[]){
		int opcao;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Escolha uma das opções abaixo:\n"
				+ "1 - Somar\n"
				+ "2 - Subtrair\n"
				+ "3 - Multiplicar\n"
				+ "4 - Dividir\n"
				+ "Opção: ");
		opcao = entrada.nextInt();
		if(opcao==1){
			System.out.println(soma());
		}else if(opcao==2){
			System.out.println(subtracao());
		}else if(opcao==3){
			System.out.println(multiplicacao());
		}else if(opcao==4){
			System.out.println(divisao());
		}else{
			System.out.println("Opção inválida!");
		}
		entrada.close();
	}
	public static void lerDados(){
		System.out.println("Informe o primeiro número: ");
		num1 = entrada.nextDouble();
		System.out.println("Informe o segundo número: ");
		num2 = entrada.nextDouble();
	}
	public static double soma(){
		lerDados();
		resultado = num1+num2;
		return resultado;		
	}
	public static double subtracao(){
		lerDados();
		resultado = num1-num2;
		return resultado;
	}
	public static double multiplicacao(){
		lerDados();
		resultado = num1*num2;
		return resultado;	
	}
	public static double divisao(){
		lerDados();
		resultado = num1+num2;
		if(num2!=0){
			resultado = num1/num2;
		}else{
			System.out.println("Não por zero!");
		}
		return resultado;
	}
}

