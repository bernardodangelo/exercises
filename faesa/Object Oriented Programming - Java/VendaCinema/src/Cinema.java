import java.util.ArrayList;
import java.util.Scanner;

public class Cinema {

	public static void main(String[] args) {

		int opcao = 0;
		Scanner sc = new Scanner(System.in);

		ArrayList<Secao> secoes = new ArrayList<>();

		do {
			System.out.println("\nMENU\n" +
					"1 - Cadastrar\n" +
					"2 - Vender\n" +
					"3 - Sair\n" +
					"Digite uma opção: ");
			opcao = sc.nextInt();

			switch(opcao) {

			case 1:
				for(int i = 0; i < 5; i++) {
					System.out.println("Digite o nome do filme:");
					String filme = sc.next();
					sc.nextLine();
					System.out.println("Digite o horário do filme:");
					String horario = sc.next();
					System.out.println("Digite o preço do filme:");
					double valor = sc.nextDouble();
					System.out.println();
					Secao secao = new Secao(filme, horario, valor);
					secoes.add(secao);
				}

				for(int i = 0; i < secoes.size(); i++) {
					System.out.println(secoes.get(i));
				}
				break;

			case 2:

				System.out.println("Escolha uma sessão:");

				for(int i = 0; i < secoes.size(); i++) {
					System.out.println(i + " - " + secoes.get(i));
				}

				int secaoEscolhida = sc.nextInt();

				Secao secao = secoes.get(secaoEscolhida);
				Assento assento = secao.getAssento();

				assento.mostraLugares();
				System.out.println("Digite a linha do assento desejado");
				int linha = sc.nextInt();
				System.out.println("Digite a coluna do assento desejado");
				int coluna = sc.nextInt();
				assento.disponivel(linha, coluna);
				assento.mostraLugares();
				break;

			case 3:
				break;
			}
			
		}while(opcao != 3);

		sc.close();	
	}


}
