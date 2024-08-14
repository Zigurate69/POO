package POO;

public class Aviao {

	String cor;
	String porte;
	int velocidade;
	int qtdAssento;

	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public int getQtdAssento() {
		return qtdAssento;
	}
	public void setQtdAssento(int qtdAssento) {
		this.qtdAssento = qtdAssento;
	}
	public String voar() {
		return "Voando";
	}
	public String pousar() {
		return "Pousando";
	}
	public String planar() {
		return "Planando";
	}



}