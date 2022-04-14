package exercicio;

import javax.swing.JOptionPane;

class Retangulo {
	
	JOptionPane janela = new JOptionPane();
	
	private double ladoUm;
	private double ladoDois;
	private double ladoTres;
	private double ladoQuatro;
	
	public final void setLadoUm(double ladoUm) {
		this.ladoUm = ladoUm;
	}
	public final double getLadoUm() {
		return ladoUm;
	}
	
	public final void setLadoDois(double ladoDois) {
		this.ladoDois = ladoDois;
	}
	public final double getLadoDois() {
		return ladoDois;
	}
	
	public final void setLadoTres(double ladoTres) {
		this.ladoTres = ladoTres;
	}
	public final double getLadoTres() {
		return ladoTres;
	}
	
	public final void setLadoQuatro(double ladoQuatro) {
		this.ladoQuatro = ladoQuatro;
	}
	public final double getLadoQuatro() {
		return ladoQuatro;
	}
	
	public void verRetangulo() {
		if (ladoUm == ladoDois && ladoTres == ladoQuatro && ladoTres == ladoDois) {
			janela.showMessageDialog(null, "É um retângulo.");
		}
		else {
			janela.showMessageDialog(null, "Não é um retângulo.");
		}
	}
}
