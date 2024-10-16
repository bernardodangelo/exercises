import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<Castelo> castelos = new ArrayList<>();
		
		castelos.add(new Japones(15, "Castelo Japones 1", 2, 2));
		castelos.add(new Japones(15, "Castelo Japones 2", 2, 2));
		
		castelos.add(new Europeu(15, "Castelo Europeu 1", 2, 2));
		castelos.add(new Europeu(15, "Castelo Europeu 2", 2, 2));
		
		while(castelos.size() > 1) {
			
			System.out.println("Escolha um dos 4 castelos para atacar!");
			System.out.println(castelos);
			
			
			
		}
		
		
	}
}
