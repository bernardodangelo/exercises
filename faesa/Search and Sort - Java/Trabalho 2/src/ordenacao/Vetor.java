package ordenacao;

import java.util.Arrays;

import dados.Item;

public class Vetor {
	private Item [] vetor;
	private int nElem;

	public Vetor(int tamanho) {
		this.vetor = new Item[tamanho];
		this.nElem = 0;
	}

	public int getnElem() {
		return nElem;
	}

	public void setnElem(int nElem) {
		this.nElem = nElem;
	}
	public boolean inserirDados(Item novo) {
		if (this.nElem == this.vetor.length) {  // verifica se está cheio
			return false;
		}else {
			this.vetor[this.nElem]= novo;
			this.nElem++;
			return true;
		}
	}
	/*
	public void selecaoDireta ( ){
		int i, j, minimo;
		Item temp;
		for (i=0; i<this.nElem-1;i++){
			minimo = i;
			for (j = i+1; j < this.nElem; j++)
				if (this.vetor[j].getChave() < this.vetor[minimo].getChave())
					minimo = j;
			temp = this.vetor[minimo];
			this.vetor[minimo] = this.vetor[i];
			this.vetor[i] = temp;
		}
	}
	static void bubbleSort(int [] vet) {
		int aux;
		for (int i=0; i< vet.length-1; i++) {
			for (int j=0; j< vet.length-1-i; j++) {
				if (vet[j] > vet[j+1]) {
					aux = vet[j];
					vet[j] = vet[j+1];
					vet[j+1] = aux;
				}
			}
		}
		
	}*/
	public void heapSort (){
		int dir = nElem-1;
		int esq = (dir-1)/2;
		Item temp;
		while (esq >= 0)
			refazHeap (esq--, this.nElem-1);
		while (dir > 0){
			temp = this.vetor[0];
			this.vetor [0] = this.vetor [dir];
			this.vetor [dir--] = temp;
			refazHeap(0, dir);
		}
	}
	private void refazHeap (int esq, int dir){
		int i = esq;
		int MaiorFolha = 2*i+1;
		Item raiz = this.vetor[i];
		boolean heap = false;
		while ((MaiorFolha <= dir) && (!heap)){
			if (MaiorFolha < dir)
				if (this.vetor[MaiorFolha].getChave()<
						this.vetor[MaiorFolha+1].getChave())
					MaiorFolha++;
			if (raiz.getChave() < this.vetor[MaiorFolha].getChave()) {
				this.vetor[i] = this.vetor[MaiorFolha];
				i = MaiorFolha;
				MaiorFolha = 2*i+1;
			}
			else
				heap = true;
		}
		this.vetor[i] = raiz;
	}

	public String toString() {
		String msg = "";
		for (int i=0; i < this.nElem; i++) {
			msg += this.vetor[i].getChave()+" ";
		}
		return msg;
	}
	
}
