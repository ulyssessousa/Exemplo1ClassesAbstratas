package principal;

import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import formasgeometricas.Circulo;
import formasgeometricas.FormaGeometrica;
import formasgeometricas.Retangulo;

public class Principal {

	private static String entradaDeDados(String mensagem) {
		String entrada;
		entrada = JOptionPane.showInputDialog(mensagem);
		return entrada;
	}
	
	private static void adicionarCirculo(
			ArrayList<FormaGeometrica> formas) {
		Circulo circulo;
		
		double auxRaio = Double.parseDouble(entrada);
		String cor = JOptionPane.showInputDialog("Digite a cor: ");
		circulo = new Circulo(auxRaio, cor);
		formas.add(circulo);
		
	}
	
	private static void adicionarRetangulo(
			ArrayList<FormaGeometrica> formas) {
		
	}
	
	public static void main(String[] args) {
		ArrayList<FormaGeometrica> formas = new ArrayList<>();
		adicionarCirculo(formas);
	}

}
