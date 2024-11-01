package pesquisa;

import java.util.LinkedList;

public class Hashing {

    private LinkedList<Integer>[] tabela;
    private int tamanho;

    @SuppressWarnings("unchecked")
    public Hashing(int tamanho) {
        this.tamanho = tamanho;
        tabela = new LinkedList[tamanho];
        for (int i = 0; i < tamanho; i++) {
            tabela[i] = new LinkedList<>();
        }
    }

    private int funcaoHash(int chave) {
        return chave % tamanho;
    }

    public void inserir(int chave) {
        int indice = funcaoHash(chave);
        if (!tabela[indice].contains(chave)) {
            tabela[indice].add(chave);
        }
    }

    public boolean pesquisar(int chave) {
        int indice = funcaoHash(chave);
        return tabela[indice].contains(chave);
    }
}
