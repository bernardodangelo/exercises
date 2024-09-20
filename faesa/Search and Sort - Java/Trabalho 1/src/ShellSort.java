public class ShellSort {
	
    private Item[] vetor;
    private int nElem;
    private int comparacoes;
    private int movimentacoes;

    public ShellSort(Item[] vetor, int nElem) {
        this.vetor = vetor;
        this.nElem = nElem;
        this.comparacoes = 0;
        this.movimentacoes = 0;
    }

    public void shellSort() {
        int i, j, h;
        Item temp;
        h = 1;

    
        do {
            h = 3 * h + 1;
        } while (h < this.nElem);

        do {
            h = h / 3;
            for (i = h; i < this.nElem; i++) {
                temp = this.vetor[i];
                j = i;

                while (j >= h && this.vetor[j - h].getChave() > temp.getChave()) {
                    comparacoes++; 
                    this.vetor[j] = this.vetor[j - h];
                    movimentacoes++;
                    j -= h;

                    if (j < h) break;
                }

                this.vetor[j] = temp;
                movimentacoes++;
            }
        } while (h != 1);
    }

    public int getComparacoes() {
        return comparacoes;
    }

    public int getMovimentacoes() {
        return movimentacoes;
    }
}
