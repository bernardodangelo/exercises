public class Europeu extends Castelo {

    private int numPaladino;

    public Europeu(int numPaladino, String nome, int defesa, int pontosVida) {
        super(nome, defesa, pontosVida);
        this.numPaladino = numPaladino;
    }

    @Override
    public boolean ataque(int d) {
        numPaladino -= d;
        if (numPaladino <= 0) {
            if (defesa > 0) {
                defesa--;
                numPaladino += 10;
                return true;
            } else if (pontosVida > 0) {
                pontosVida--;
                defesa = 2;
                numPaladino += 10;
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    @Override
    public String situacao() {
        return "Castelo Europeu - Paladinos: " + numPaladino + ", Defesas: " + defesa + ", Pontos de Vida: " + pontosVida;
    }
}
