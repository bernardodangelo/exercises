public class Japones extends Castelo {

    private int numSamurai;

    public Japones(int numSamurai, String nome, int defesa, int pontosVida) {
        super(nome, defesa, pontosVida);
        this.numSamurai = numSamurai;
    }

    @Override
    public boolean ataque(int d) {
        numSamurai -= d;
        if (numSamurai <= 0) {
            if (defesa > 0) {
                defesa--; 
                numSamurai += 15; 
                return true;
            } else if (pontosVida > 0) {
                pontosVida--;
                defesa = 2;
                numSamurai += 15;
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    @Override
    public String situacao() {
        return "Castelo Japonês - Samurais: " + numSamurai + ", Defesas: " + defesa + ", Pontos de Vida: " + pontosVida;
    }
}
