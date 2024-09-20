import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione o arquivo (1 - Aleatório, 2 - Crescente, 3 - Decrescente): ");
        int opcao = scanner.nextInt();

        String arquivo = "C:\\Users\\HP\\Desktop\\";
        switch (opcao) {
            case 1:
                arquivo += "aleatório 100.txt";
                break;
            case 2:
                arquivo += "crescente 100.txt";
                break;
            case 3:
                arquivo += "decrescente 100.txt";
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        Item[] vetor = lerArquivo(arquivo);

        InsercaoDireta insercaoDireta = new InsercaoDireta(vetor, vetor.length);
        insercaoDireta.insercaoDireta();

        System.out.println("Número de comparações: " + insercaoDireta.getComparacoes());
        System.out.println("Número de movimentações: " + insercaoDireta.getMovimentacoes());
    }

    public static Item[] lerArquivo(String nomeArquivo) throws FileNotFoundException {
        File file = new File(nomeArquivo);
        Scanner sc = new Scanner(file);

        int contador = 0;
        while (sc.hasNextInt()) {
            sc.nextInt();
            contador++;
        }

        Item[] vetor = new Item[contador];

        sc = new Scanner(file);
        for (int i = 0; i < contador; i++) {
            int chave = sc.nextInt();
            vetor[i] = new Item(chave); 
        }

        sc.close();
        System.out.println("Número de elementos lidos: " + contador);
        return vetor;
    }
}
