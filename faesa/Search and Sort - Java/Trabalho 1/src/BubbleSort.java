public class BubbleSort {
    private Item[] vetor;
    private int nElem;
    private int comparacoes;
    private int movimentacoes;

    public BubbleSort(Item[] vetor, int nElem) {
        this.vetor = vetor;
        this.nElem = nElem;
        this.comparacoes = 0;
        this.movimentacoes = 0;
    }

    public void bubblesort() {
        int n, i, j;
        Item temp;
        n = this.nElem - 1;
        do {
            i = 0;
            for (j = 0; j < n; j++) {
                comparacoes++; 
                if (this.vetor[j].getChave() > this.vetor[j + 1].getChave()) {
                    temp = this.vetor[j];
                    this.vetor[j] = this.vetor[j + 1];
                    this.vetor[j + 1] = temp;
                    i = j;
                    movimentacoes += 2;
                }
            }
            n = i;
        } while (n >= 1);
    }

    public int getComparacoes() {
        return comparacoes;
    }

    public int getMovimentacoes() {
        return movimentacoes;
    }
}
