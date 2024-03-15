package formasgeometricas;

public class Retangulo extends FormaGeometrica {
	private double base;
	private double altura;
	
	public Retangulo(double base,
					double altura,
					String cor) {
		super(cor);
		this.base = base;
		this.altura = altura;
		setNome("Retângulo");
	}

	@Override
	public double calcularArea() {
		return base * altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calcularPerimetro() {
		return 2 * base + 2 * altura;
	}
	
	
	
}
