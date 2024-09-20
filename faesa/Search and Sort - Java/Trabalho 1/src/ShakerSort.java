public class ShakerSort {
	
    private Item[] vetor;
    private int nElem;
    private int comparacoes;
    private int movimentacoes;

    public ShakerSort(Item[] vetor, int nElem) {
        this.vetor = vetor;
        this.nElem = nElem;
        this.comparacoes = 0;
        this.movimentacoes = 0;
    }

    public void shakersort() {
        int esq, dir, i, j;
        Item temp;
        esq = 1;
        dir = this.nElem - 1;
        j = dir;
        do {
            for (i = dir; i >= esq; i--) {
                comparacoes++;
                if (this.vetor[i - 1].getChave() > this.vetor[i].getChave()) {
                    temp = this.vetor[i];
                    this.vetor[i] = this.vetor[i - 1];
                    this.vetor[i - 1] = temp;
                    j = i;
                    movimentacoes += 2;
                }
            }
            esq = j + 1;

            for (i = esq; i <= dir; i++) {
                comparacoes++; 
                if (this.vetor[i - 1].getChave() > this.vetor[i].getChave()) {
                    temp = this.vetor[i];
                    this.vetor[i] = this.vetor[i - 1];
                    this.vetor[i - 1] = temp;
                    j = i;
                    movimentacoes += 2;
                }
            }
            dir = j - 1;
        } while (esq <= dir);
    }

    public int getComparacoes() {
        return comparacoes;
    }

    public int getMovimentacoes() {
        return movimentacoes;
    }
}
