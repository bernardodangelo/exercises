
public class Assento {
	
	private boolean[][] lugares = new boolean[5][4];
	
	public void disponivel(int linha, int coluna) {
		if(!lugares[linha][coluna]) {
			lugares[linha][coluna] = true;
			System.out.println("Assento selecionado com sucesso!");
		}else {
			System.out.println("Este lugar já está ocupado!");
		}
	}
	
	public void mostraLugares() {
		System.out.println("0 1 2 3");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
            	if(lugares[i][j] == true) {
            		System.out.print("X ");
            	}
            	else {
            		System.out.print("- ");
            	}
			}
            System.out.println(i);
		}
	}

}


