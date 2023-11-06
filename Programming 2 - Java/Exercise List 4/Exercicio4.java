public class Exercicio4 {
	
	public static void main(String[] args) {
		int contador = 0;
		String palavra = "3vogais";
		
		palavra.toLowerCase();
		
		for(int i = 0; i < palavra.length();i++) {
			char letra = palavra.charAt(i);
			if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
				contador++;
			}
		}
		
		System.out.println("Quantidade de vogais = " + contador);
		
	}
}
