package Lista6Ex2;

import Lista6Ex1.Pessoa;

//2. Considere, como subclasse da classe Pessoa
//(desenvolvida no exercício anterior) a classe Fornecedor.
//Considere que cada instância da classe Fornecedor tem,
//para além dos atributos que caracterizam a classe Pessoa,
//os atributos valorCredito (correspondente ao crédito máximo
//atribuído ao fornecedor) e valorDivida (montante da 
//dívida para com o fornecedor). Implemente na classe Fornecedor,
//para além dos usuais métodos seletores e modificadores,
//um método obterSaldo() que devolve a diferença entre os valores
//dos atributos valorCredito e valorDivida. Depois de implementada 
//a classe Fornecedor, crie um programa de teste adequado que lhe permita 
//verificar o funcionamento dos métodos implementados na classe Fornecedor
//e os herdados da classe Pessoa. 

public class Fornecedor extends Pessoa {
	private double valorCredito;
	private double valorDivida;
	
	public Fornecedor(String nome, String endereco, int telefone) {
		super(nome, endereco, telefone);
		
	}
	
	public Fornecedor(String nome, String endereco, int telefone, double valorCredito,double valorDivida) {
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}


	public double getValorCredito() {
		return valorCredito;
	}


	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}


	public double getValorDivida() {
		return valorDivida;
	}


	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}


	public double obterSaldo ( double obterSaldo) {
		obterSaldo = this.valorCredito - this.valorDivida;
		return obterSaldo;
	}
	
}
