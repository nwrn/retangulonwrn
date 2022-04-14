package exercicio;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		
		JOptionPane input = new JOptionPane();
		Retangulo retang = new Retangulo();
		
		String um;
		um = input.showInputDialog("Digite o valor do lado um:");
		String dois;-
		dois = input.showInputDialog("Digite o valor do lado dois:");
		String tres;
		tres = input.showInputDialog("Digite o valor do lado três:");
		String quatro;
		quatro = input.showInputDialog("Digite o valor do lado quatro:");
		
		double ladoUm = Double.parseDouble(um);
		double ladoDois = Double.parseDouble(dois);
		double ladoTres = Double.parseDouble(tres);
		double ladoQuatro = Double.parseDouble(quatro);
		
		retang.setLadoUm(ladoUm);
		retang.setLadoDois(ladoDois);
		retang.setLadoTres(ladoTres);
		retang.setLadoQuatro(ladoQuatro);
		
		retang.verRetangulo();
		
		
		
	}

}
