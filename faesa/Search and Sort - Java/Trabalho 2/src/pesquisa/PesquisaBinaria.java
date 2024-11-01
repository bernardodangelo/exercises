package pesquisa;

import java.util.Arrays;

public class PesquisaBinaria {

    public int pesquisar(int[] vetor, int valor) {
        Arrays.sort(vetor);
        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (vetor[meio] == valor) {
                return meio;
            } else if (vetor[meio] < valor) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }
}
