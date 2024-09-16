
public class Secao {
	
	private String nome;
	private String horario;
	private double preco;
	private Assento assento;
	
	public Secao(String nome, String horario, double preco) {
		this.nome = nome;
		this.horario = horario;
		this.preco = preco;
		this.assento = new Assento();
	}
	
	public String toString() {
		return "Secao [nome=" + nome + ", horario=" + horario + ", preco=" + preco + "]";
	}

	public Assento getAssento() {
		return assento;
	}
	
}
