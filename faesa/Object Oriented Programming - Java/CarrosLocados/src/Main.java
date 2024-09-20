import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Carro carro1 = new Carro("Ferrari", 1, true);
		Carro carro2 = new Carro("Subaru", 2, true);
		Carro carro3 = new Carro("Fiat", 3, false);
		Carro carro4 = new Carro("Gol", 4, true);
		Carro carro5 = new Carro("Mercedes", 5, false);

		ArrayList<Carro> carros = new ArrayList<Carro>();

		carros.add(carro1);
		carros.add(carro2);
		carros.add(carro3);
		carros.add(carro4);
		carros.add(carro5);

		int codigo;
		int opcao = 0;
		do{

			System.out.println("\nMENU");
			System.out.println("1 - Locar");
			System.out.println("2 - Devolver");
			System.out.println("Digite uma opção do menu");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o código do carro que deseja locar");
				codigo = sc.nextInt();
				for (Carro c : carros) {
					if(c != null && c.getCodigo() == codigo) {
						if(c.locar()) {
							System.out.println("Carro Locado!");
							System.out.println("Número de Carros Locados " + c.getLocados());
						}
						else {
							System.out.println("Carro Indisponível");
						}
					}
				}
				break;
			case 2:
				System.out.println("Digite o código do carro que deseja devolver");
				codigo = sc.nextInt();
				for (Carro c : carros) {
					if(c != null && c.getCodigo() == codigo) {
						if(c.devolver()) {
							System.out.println("Carro devolvido!");
							System.out.println("Número de Carros Locados " + c.getLocados());
						}
						else {
							System.out.println("Carro Indisponível");
						}
					}
				}
				break;
			}
		}while(opcao != 3);
		sc.close();
	}
}
