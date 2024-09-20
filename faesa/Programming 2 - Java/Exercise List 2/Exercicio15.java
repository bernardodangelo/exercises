import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a hora de início do jogo");
		int hora = sc.nextInt();
		
		System.out.println("Informe os minutos de início do jogo");
		int minutos = sc.nextInt();
		
		System.out.println("Informe a hora de finalização do jogo");
		int horaF = sc.nextInt();
		
		System.out.println("Informe os minutos de finalização do jogo");
		int minutosF = sc.nextInt();
		
		if(hora>24 || horaF >24) {
			System.out.println("“Entrada de dados não é válida”");
			System.exit(0);
		}
		else if(minutos>60 || minutosF >60) {
			System.out.println("“Entrada de dados não é válida”");
			System.exit(0);
		}
		
		int duracaoM;
		int minutosIniciais = hora * 60 + minutos;
		int minutosFinais = horaF * 60 + minutosF;
		
		if(minutosIniciais <= minutosFinais) {
			duracaoM = minutosFinais - minutosIniciais;
		}
		else {
			duracaoM = 24*60 - minutosIniciais + minutosFinais;
		}
		
		int duracaoH = duracaoM /60;
		int duracaoMRestantes = duracaoM % 60;
		
		System.out.println("Duracação do jogo: " + duracaoH + " horas " + duracaoMRestantes + " minutos");
		
		sc.close();
		
	}

}