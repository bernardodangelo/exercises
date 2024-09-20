import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Program {
	public static void main(String[] args) throws FileNotFoundException {
		
		File nomes = new File("/home/bernardo/Downloads/Atividade/nomes.txt");
		Scanner scNomes = new Scanner(nomes);
		
		File sobrenomes = new File("/home/bernardo/Downloads/Atividade/sobrenomes.txt");
		Scanner scSobrenomes = new Scanner(sobrenomes);
		
		Random random = new Random();
		ArrayList<String> listaNomes = new ArrayList<String>();
		ArrayList<String> listaSobrenomes = new ArrayList<String>();
		
		while(scNomes.hasNextLine()) {
			listaNomes.add(scNomes.nextLine());
		}
		while(scSobrenomes.hasNextLine()) {
			listaSobrenomes.add(scSobrenomes.nextLine());
		}
		
		int nome = random.nextInt(19);
		int sobrenome = random.nextInt(19);
		int idade = random. nextInt(100);
		
		System.out.println(listaNomes.get(nome) + " " + listaSobrenomes.get(sobrenome) + " " + idade + " anos");

	}
}