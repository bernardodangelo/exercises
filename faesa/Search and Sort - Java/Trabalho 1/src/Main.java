import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione o tipo de arquivo (1 - Aleatório, 2 - Crescente, 3 - Decrescente): ");
        int tipo = scanner.nextInt();
        System.out.println("Selecione a quantidade de elementos (1 - 100, 2 - 10000): ");
        int quantidade = scanner.nextInt();

        String arquivo = "C:\\Users\\HP\\eclipse-workspace\\Trabalho 1\\";

        switch (tipo) {
            case 1:
                arquivo += "aleatório ";
                break;
            case 2:
                arquivo += "crescente ";
                break;
            case 3:
                arquivo += "decrescente ";
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        switch (quantidade) {
            case 1:
                arquivo += "100.txt";
                break;
            case 2:
                arquivo += "10000.txt";
                break;
            default:
                System.out.println("Quantidade inválida.");
                return;
        }

        Item[] vetor = lerArquivo(arquivo);

        System.out.println("Selecione o algoritmo de ordenação (1 - Inserção Direta, 2 - Seleção Direta, 3 - BubbleSort, 4 - ShakerSort, 5 - ShellSort, 6 - HeapSort, 7 - QuickSort): ");
        int algoritmo = scanner.nextInt();

        if (algoritmo == 1) {
            InsercaoDireta insercaoDireta = new InsercaoDireta(vetor, vetor.length);
            insercaoDireta.insercaoDireta();
            System.out.println("Número de comparações: " + insercaoDireta.getComparacoes());
            System.out.println("Número de movimentações: " + insercaoDireta.getMovimentacoes());
        } else if (algoritmo == 2) {
            SelecaoDireta selecaoDireta = new SelecaoDireta(vetor, vetor.length);
            selecaoDireta.selecaoDireta();
            System.out.println("Número de comparações: " + selecaoDireta.getComparacoes());
            System.out.println("Número de movimentações: " + selecaoDireta.getMovimentacoes());
        } else if (algoritmo == 3) {
            BubbleSort bubbleSort = new BubbleSort(vetor, vetor.length);
            bubbleSort.bubblesort();
            System.out.println("Número de comparações: " + bubbleSort.getComparacoes());
            System.out.println("Número de movimentações: " + bubbleSort.getMovimentacoes());
        } else if (algoritmo == 4) {
            ShakerSort shakerSort = new ShakerSort(vetor, vetor.length);
            shakerSort.shakersort();
            System.out.println("Número de comparações: " + shakerSort.getComparacoes());
            System.out.println("Número de movimentações: " + shakerSort.getMovimentacoes());
        } else if (algoritmo == 5) {
            ShellSort shellSort = new ShellSort(vetor, vetor.length);
            shellSort.shellSort();
            System.out.println("Número de comparações: " + shellSort.getComparacoes());
            System.out.println("Número de movimentações: " + shellSort.getMovimentacoes());
        } else if (algoritmo == 6) {
            HeapSort heapSort = new HeapSort(vetor, vetor.length);
            heapSort.heapSort();
            System.out.println("Número de comparações: " + heapSort.getComparacoes());
            System.out.println("Número de movimentações: " + heapSort.getMovimentacoes());
        } else if (algoritmo == 7) {
            QuickSort quickSort = new QuickSort(vetor, vetor.length);
            quickSort.quicksort();
            System.out.println("Número de comparações: " + quickSort.getComparacoes());
            System.out.println("Número de movimentações: " + quickSort.getMovimentacoes());
        } else {
            System.out.println("Opção inválida.");
        }
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
