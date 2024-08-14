package POO2;

public class Animal {

	String nome;
	String genero;
	String cor;
	int peso;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String comer() {
		return "comendo";
	}
	public String dormir() {
		return "dormindo";
	}
	public String emitirsom() {
		return "emitindo som";
	}
}
