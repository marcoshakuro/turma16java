package lista5Ex2;
//2) Crie uma classe avi�o e apresente os
//atributos e m�todos referentes esta classe,
//em seguida crie um objeto avi�o, defina as instancias
//deste objeto e apresente as informa��es deste objeto no console.

public class Aviao {
	
	public String cor;
	private String modelo;
	private int numeroPassageiros;
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
		
	}
	public int getNumeroPassageiros() {
		return this.numeroPassageiros;
	}
	
	public void setNumeroPassageiros(int numeroPassageiros) {
		this.numeroPassageiros = numeroPassageiros;
		
	}
}
