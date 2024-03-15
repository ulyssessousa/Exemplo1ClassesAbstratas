package formasgeometricas;

public abstract class FormaGeometrica {

	private String nome;
	private String cor;
	
	public FormaGeometrica(String cor) {
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public abstract double calcularArea();
	
	
}
