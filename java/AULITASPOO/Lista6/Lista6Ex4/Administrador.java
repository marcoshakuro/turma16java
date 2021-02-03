package Lista6Ex4;
//4. Implemente a classe Administrador como subclasse
//da classe pessoa. Um determinado administrador tem como
//atributos da classe Pessoa e também os atributos próprios
//como ajudaDeCusto (ajudas referentes a viagens, estadias).

import Lista6Ex1.Pessoa;

public class Administrador extends Pessoa{
	private double ajudaDeCusto;

	public Administrador(String nome, String endereco, double ajudaDeCusto) {
		super(nome, endereco);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	

}
