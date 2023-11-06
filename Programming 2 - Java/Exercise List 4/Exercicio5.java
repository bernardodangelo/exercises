public class Exercicio5 {
	
	public static void main(String[] args) {
		int vetor1[] = {8,2,5}, vetor2[] = {0,0,0};
		
		for(int i = 0; i < 3 ;i++) {
			if(vetor1[i] % 2 == 0) {
				vetor2[i] = vetor1[i];
			}else {
				vetor2[i] = 0;
			}
		}
		System.out.println("Vetor: ");
		for(int i = 0; i < 3; i++) {
			System.out.println(vetor2[i]);
		}
	}
}
