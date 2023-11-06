public class Exercicio9 {
	
	public static void main(String[] args) {
		int maior, divisor = 0, a = 88, b = 44;
		
		if(a>b) {
			maior = a;
		}else {
			maior = b;
		}
		for(int i = 1; i < maior; i++) {
			if(a % i == 0 && b % i == 0) {
				divisor = i;
			}else {
				i++;
			}
		}
		System.out.println("Maior divisor = " + divisor);
	}

}
