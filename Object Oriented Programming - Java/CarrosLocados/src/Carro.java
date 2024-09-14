
public class Carro {

	private String modelo;
	private int codigo;
	private boolean locado;
	
	private static int numLocados = 0;

	public Carro(String modelo, int codigo, boolean locado) {
		this.modelo = modelo;
		this.codigo = codigo;
		this.locado = locado;
		if(!this.locado) {
			numLocados += 1;
		}
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public boolean isLocado() {
		return locado;
	}
	public void setLocado(boolean locado) {
		this.locado = locado;
	}
	
	public int getLocados() {
		return numLocados;
	}
	
	public boolean locar() {
		if(!isLocado()) {
			this.locado = true;
			numLocados += 1;
			return true;
		}
		return false;
	}
	
	public boolean devolver () {
		if(isLocado()) {
			this.locado = false;
			numLocados -= 1;
			return true;
		}
		return false;
		
	}
}
