import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		String[] tipos = { "aleatório", "crescente", "decrescente" };
		int[] quantidades = { 100, 10000 };

		for (int quantidade : quantidades) {
			for (String tipo : tipos) {
				System.out.println("Resultados para n = " + quantidade + " e tipo = " + tipo + ":");
				
				Item[] vetor = lerArquivo(tipo, quantidade);

				InsercaoDireta insercaoDireta = new InsercaoDireta(vetor, vetor.length);
				insercaoDireta.insercaoDireta();
				System.out.println("Inserção Direta: " + tipo + " (n=" + quantidade + ") - Comparações: "
						+ insercaoDireta.getComparacoes() + ", Movimentações: " + insercaoDireta.getMovimentacoes());

				SelecaoDireta selecaoDireta = new SelecaoDireta(vetor, vetor.length);
				selecaoDireta.selecaoDireta();
				System.out.println("Seleção Direta: " + tipo + " (n=" + quantidade + ") - Comparações: "
						+ selecaoDireta.getComparacoes() + ", Movimentações: " + selecaoDireta.getMovimentacoes());

				BubbleSort bubbleSort = new BubbleSort(vetor, vetor.length);
				bubbleSort.bubblesort();
				System.out.println("BubbleSort: " + tipo + " (n=" + quantidade + ") - Comparações: "
						+ bubbleSort.getComparacoes() + ", Movimentações: " + bubbleSort.getMovimentacoes());

				ShakerSort shakerSort = new ShakerSort(vetor, vetor.length);
				shakerSort.shakersort();
				System.out.println("ShakerSort: " + tipo + " (n=" + quantidade + ") - Comparações: "
						+ shakerSort.getComparacoes() + ", Movimentações: " + shakerSort.getMovimentacoes());

				ShellSort shellSort = new ShellSort(vetor, vetor.length);
				shellSort.shellSort();
				System.out.println("ShellSort: " + tipo + " (n=" + quantidade + ") - Comparações: "
						+ shellSort.getComparacoes() + ", Movimentações: " + shellSort.getMovimentacoes());

				HeapSort heapSort = new HeapSort(vetor, vetor.length);
				heapSort.heapSort();
				System.out.println("HeapSort: " + tipo + " (n=" + quantidade + ") - Comparações: "
						+ heapSort.getComparacoes() + ", Movimentações: " + heapSort.getMovimentacoes());

				QuickSort quickSort = new QuickSort(vetor, vetor.length);
				quickSort.quicksort();
				System.out.println("QuickSort: " + tipo + " (n=" + quantidade + ") - Comparações: "
						+ quickSort.getComparacoes() + ", Movimentações: " + quickSort.getMovimentacoes());

				System.out.println(); 
			}
		}
	}

	public static Item[] lerArquivo(String tipo, int quantidade) throws FileNotFoundException {
		String arquivo = "C:\\Users\\Consys\\Documents\\exercises\\faesa\\Search and Sort - Java\\Trabalho 1\\";
		arquivo += tipo + " " + quantidade + ".txt";
		
		File file = new File(arquivo);
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
		return vetor;
	}
}
