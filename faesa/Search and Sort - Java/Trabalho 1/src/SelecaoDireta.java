public class SelecaoDireta {
    private Item[] vetor;
    private int nElem;
    private int comparacoes;
    private int movimentacoes;

    public SelecaoDireta(Item[] vetor, int nElem) {
        this.vetor = vetor;
        this.nElem = nElem;
        this.comparacoes = 0;
        this.movimentacoes = 0;
    }

    public void selecaoDireta() {
        int i, j, minimo;
        Item temp;
        for (i = 0; i < this.nElem - 1; i++) {
            minimo = i;
            for (j = i + 1; j < this.nElem; j++) {
                comparacoes++;
                if (this.vetor[j].getChave() < this.vetor[minimo].getChave()) {
                    minimo = j;
                }
            }
            
            temp = this.vetor[minimo];
            this.vetor[minimo] = this.vetor[i];
            this.vetor[i] = temp;
            movimentacoes += 2;
        }
    }

    public int getComparacoes() {
        return comparacoes;
    }

    public int getMovimentacoes() {
        return movimentacoes;
    }
}
