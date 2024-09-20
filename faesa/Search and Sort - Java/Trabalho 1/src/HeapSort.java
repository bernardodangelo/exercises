public class HeapSort {
	
    private Item[] vetor;
    private int nElem;
    private int comparacoes;
    private int movimentacoes;

    public HeapSort(Item[] vetor, int nElem) {
        this.vetor = vetor;
        this.nElem = nElem;
        this.comparacoes = 0;
        this.movimentacoes = 0;
    }

    public void heapSort() {
        int dir = nElem - 1;
        int esq = (dir - 1) / 2;
        Item temp;

        while (esq >= 0) {
            refazHeap(esq--, this.nElem - 1);
        }

        while (dir > 0) {
            temp = this.vetor[0];
            this.vetor[0] = this.vetor[dir];
            this.vetor[dir--] = temp;
            movimentacoes++;
            refazHeap(0, dir);
        }
    }

    private void refazHeap(int esq, int dir) {
        int i = esq;
        int maiorFolha = 2 * i + 1;
        Item raiz = this.vetor[i];
        boolean heap = false;

        while (maiorFolha <= dir && !heap) {
            comparacoes++; 

            if (maiorFolha < dir) {
                if (this.vetor[maiorFolha].getChave() < this.vetor[maiorFolha + 1].getChave()) {
                    maiorFolha++;
                }
            }

            if (raiz.getChave() < this.vetor[maiorFolha].getChave()) {
                this.vetor[i] = this.vetor[maiorFolha];
                movimentacoes++; 
                i = maiorFolha;
                maiorFolha = 2 * i + 1;
            } else {
                heap = true;
            }
        }

        this.vetor[i] = raiz;
        movimentacoes++; 
    }

    public int getComparacoes() {
        return comparacoes;
    }

    public int getMovimentacoes() {
        return movimentacoes;
    }
}
