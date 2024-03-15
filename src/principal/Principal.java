package principal;

import java.text.DecimalFormat;

import formasgeometricas.Circulo;
import formasgeometricas.Retangulo;

public class Principal {

	public static void main(String[] args) {
		Retangulo r1 = new Retangulo(4, 2, "Verde");
		
		Circulo c1 = new Circulo(3, "Azul");
		
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		System.out.println("Área do " + r1.getNome()
					 + ": " + r1.calcularArea());
		
		System.out.println("Área do " + c1.getNome()
		 	+ ": " + formatador.format(c1.calcularArea()));
	
	}

}
