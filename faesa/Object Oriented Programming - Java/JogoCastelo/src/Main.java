import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Castelo> castelos = new ArrayList<>();
        ArrayList<Castelo> castelosDestruidos = new ArrayList<>();

        castelos.add(new Japones(15, "Castelo Japones 1", 2, 2));
        castelos.add(new Japones(15, "Castelo Japones 2", 2, 2));
        castelos.add(new Europeu(10, "Castelo Europeu 1", 3, 2));
        castelos.add(new Europeu(10, "Castelo Europeu 2", 3, 2));

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while (castelos.size() > 1) {
            for (int i = 0; i < castelos.size(); i++) {
                Castelo atacante = castelos.get(i);

                System.out.println(atacante.getNome() + " está atacando!");
                int alvoIndex;

                do {
                    System.out.println("Escolha um castelo para atacar:");
                    for (int j = 0; j < castelos.size(); j++) {
                        if (i != j) {
                            System.out.println(j + " - " + castelos.get(j).getNome());
                        }
                    }
                    alvoIndex = scanner.nextInt();
                } while (alvoIndex == i || alvoIndex < 0 || alvoIndex >= castelos.size());

                Castelo alvo = castelos.get(alvoIndex);

                int dado = random.nextInt(11);
                if (dado == 0) {
                    System.out.println(atacante.getNome() + " passou a vez.");
                } else {
                    System.out.println(atacante.getNome() + " atacou " + alvo.getNome() + " com " + dado + " de dano!");
                    if (!alvo.ataque(dado)) {
                        System.out.println(alvo.situacao() + " - DESTRUÍDO!");
                        castelosDestruidos.add(alvo);
                        castelos.remove(alvo);
                    } else {
                        System.out.println(alvo.situacao());
                    }
                }

                mostrarSituacao(castelos, castelosDestruidos);

                if (castelos.size() == 1) {
                    break;
                }
            }
        }

        System.out.println("CASTELO " + castelos.get(0).getNome() + " VENCEDOR!");
        scanner.close();
    }

    private static void mostrarSituacao(ArrayList<Castelo> castelos, ArrayList<Castelo> castelosDestruidos) {
        System.out.println("\n--- Situação dos Castelos ---");
        System.out.println("Castelos Vivos:");
        for (Castelo c : castelos) {
            System.out.println(c.situacao());
        }
        System.out.println("\nCastelos Destruídos:");
        for (Castelo c : castelosDestruidos) {
            System.out.println(c.situacao());
        }
        System.out.println("-----------------------------\n");
    }
}
