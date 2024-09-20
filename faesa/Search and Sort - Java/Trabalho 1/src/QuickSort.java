public class QuickSort {
	
    private Item[] vetor;
    private int nElem;
    private int comparacoes;
    private int movimentacoes;

    public QuickSort(Item[] vetor, int nElem) {
        this.vetor = vetor;
        this.nElem = nElem;
        this.comparacoes = 0;
        this.movimentacoes = 0;
    }

    public void quicksort() {
        ordena(0, this.nElem - 1);
    }

    private void ordena(int esq, int dir) {
        int pivo, i = esq, j = dir;
        Item temp;
        pivo = this.vetor[(i + j) / 2].getChave();

        do {
            while (this.vetor[i].getChave() < pivo) {
                i++;
                comparacoes++;
            }
            while (this.vetor[j].getChave() > pivo) {
                j--;
                comparacoes++;
            }

            if (i <= j) {
                temp = this.vetor[i];
                this.vetor[i] = this.vetor[j];
                this.vetor[j] = temp;
                movimentacoes++; 
                i++;
                j--;
            }

        } while (i <= j);

        if (esq < j) {
            ordena(esq, j);
        }
        if (dir > i) {
            ordena(i, dir);
        }
    }

    public int getComparacoes() {
        return comparacoes;
    }

    public int getMovimentacoes() {
        return movimentacoes;
    }
}
