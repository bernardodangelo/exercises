public class Exercicio3 {
	
	public static void main(String[] args) {
		int v[] = {5,3,4}, maior = 0;
		for(int i =0; i < 3;i++) {
			if(v[i] > maior) {
				maior = v[i];
			}
		}
		System.out.printf("Maior número dentro do vetor = " + maior);
	}
}
