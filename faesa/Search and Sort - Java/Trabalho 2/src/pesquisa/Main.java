package pesquisa;

import java.io.*;
import java.util.Scanner;

public class Main {

    private int[] vetor;
    private PesquisaSequencial pesquisaSequencial = new PesquisaSequencial();
    private PesquisaBinaria pesquisaBinaria = new PesquisaBinaria();
    private Hashing hashing;

    public static void main(String[] args) {
        Main main = new Main();
        main.menu();
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Criar Vetor");
            System.out.println("2. Ler Arquivo");
            System.out.println("3. Pesquisa Sequencial");
            System.out.println("4. Pesquisa Binária");
            System.out.println("5. Comparar Algoritmos");
            System.out.println("6. Hashing");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    criarVetor(scanner);
                    break;
                case 2:
                    lerArquivo();
                    break;
                case 3:
                    pesquisarSequencial(scanner);
                    break;
                case 4:
                    pesquisarBinaria(scanner);
                    break;
                case 5:
                    compararAlgoritmos(scanner);
                    break;
                case 6:
                    hashing(scanner);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private void criarVetor(Scanner scanner) {
        System.out.print("Informe o tamanho do vetor: ");
        int tamanho = scanner.nextInt();
        vetor = new int[tamanho];
        System.out.print("Preenchimento manual (1) ou aleatório (0)? ");
        boolean manual = scanner.nextInt() == 1;

        if (manual) {
            for (int i = 0; i < tamanho; i++) {
                System.out.print("Digite o valor " + (i + 1) + ": ");
                vetor[i] = scanner.nextInt();
            }
        } else {
            for (int i = 0; i < tamanho; i++) {
                vetor[i] = (int) (Math.random() * 10000);
            }
            System.out.println("Vetor preenchido com valores aleatórios.");
        }
    }

    private void lerArquivo() {
        String nomeArquivo = "numeros_aleatorios.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            vetor = br.lines().mapToInt(Integer::parseInt).toArray();
            System.out.println("Arquivo " + nomeArquivo + " lido e vetor atualizado.");
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Arquivo contém valores inválidos.");
        }
    }

    private void pesquisarSequencial(Scanner scanner) {
        if (vetor == null) {
            System.out.println("Crie ou carregue um vetor primeiro.");
            return;
        }
        System.out.print("Digite o valor para pesquisa sequencial: ");
        int valor = scanner.nextInt();
        int posicao = pesquisaSequencial.pesquisar(vetor, valor);
        System.out.println(posicao >= 0 ? "Valor encontrado na posição " + posicao : "Valor não encontrado.");
    }

    private void pesquisarBinaria(Scanner scanner) {
        if (vetor == null) {
            System.out.println("Crie ou carregue um vetor primeiro.");
            return;
        }
        System.out.print("Digite o valor para pesquisa binária: ");
        int valor = scanner.nextInt();
        int posicao = pesquisaBinaria.pesquisar(vetor, valor);
        System.out.println(posicao >= 0 ? "Valor encontrado na posição " + posicao : "Valor não encontrado.");
    }

    private void compararAlgoritmos(Scanner scanner) {
        if (vetor == null) {
            System.out.println("Crie ou carregue um vetor primeiro.");
            return;
        }
        System.out.print("Digite o valor para comparar algoritmos: ");
        int valor = scanner.nextInt();

        long inicio = System.nanoTime();
        pesquisaSequencial.pesquisar(vetor, valor);
        long tempoSeq = System.nanoTime() - inicio;

        inicio = System.nanoTime();
        pesquisaBinaria.pesquisar(vetor, valor);
        long tempoBin = System.nanoTime() - inicio;

        System.out.println("Tempo Pesquisa Sequencial: " + tempoSeq + " ns");
        System.out.println("Tempo Pesquisa Binária: " + tempoBin + " ns");
    }

    private void hashing(Scanner scanner) {
        if (vetor == null) {
            System.out.println("Crie ou carregue um vetor primeiro.");
            return;
        }
        if (hashing == null) {
            hashing = new Hashing(vetor.length);
            for (int valor : vetor) {
                hashing.inserir(valor);
            }
            System.out.println("Tabela hash preenchida.");
        }

        System.out.print("Digite o valor para pesquisa na tabela hash: ");
        int valor = scanner.nextInt();
        boolean encontrado = hashing.pesquisar(valor);
        System.out.println(encontrado ? "Valor encontrado na tabela hash." : "Valor não encontrado.");
    }
}
