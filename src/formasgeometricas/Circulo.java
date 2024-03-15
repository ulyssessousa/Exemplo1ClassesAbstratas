package formasgeometricas;

public class Circulo extends FormaGeometrica {
	
	private double raio;

	public Circulo(double raio, String cor) {
		super(cor);
		this.raio = raio;
		setNome("Círculo");
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		
		return Math.PI * raio * raio;
	}

	@Override
	public double calcularPerimetro() {
		
		return 2 * Math.PI * raio;
	}
	
	
	
	

}
