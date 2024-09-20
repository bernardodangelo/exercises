public class InsercaoDireta {
	
    private Item[] vetor;
    private int nElem;
    private int comparacoes;
    private int movimentacoes;

    public InsercaoDireta(Item[] vetor, int nElem) {
        this.vetor = vetor;
        this.nElem = nElem;
        this.comparacoes = 0;
        this.movimentacoes = 0;
    }

    public void insercaoDireta() {
        int i, j;
        Item temp;

        for (i = 1; i < this.nElem; i++) {
            temp = this.vetor[i];
            j = i - 1;

            while ((j >= 0) && (this.vetor[j].getChave() > temp.getChave())) {
                this.comparacoes++;  
                this.vetor[j + 1] = this.vetor[j];
                j--;
                this.movimentacoes++;
            }

            this.vetor[j + 1] = temp;
            this.movimentacoes++;  
        }
    }

    public int getComparacoes() {
        return this.comparacoes;
    }

    public int getMovimentacoes() {
        return this.movimentacoes;
    }
}