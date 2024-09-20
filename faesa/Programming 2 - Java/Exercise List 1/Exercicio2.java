import java.util.Scanner;


public class Exercicio2 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de KM");
		float km = sc.nextFloat();
		
		System.out.println("Digite a quantidade de gasolina");
		float gasolina = sc.nextFloat();
		
		float resultado = gasolina / km;
		
		System.out.println("Gasolina por KM: " + resultado);
		
	}
}