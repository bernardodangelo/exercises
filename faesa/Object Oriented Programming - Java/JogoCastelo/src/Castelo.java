public abstract class Castelo {

    protected String nome;
    protected int defesa;
    protected int pontosVida;

    public Castelo(String nome, int defesa, int pontosVida) {
        this.nome = nome;
        this.defesa = defesa;
        this.pontosVida = pontosVida;
    }

    public String getNome() {
        return nome;
    }

    public abstract boolean ataque(int d);

    public abstract String situacao();
}
