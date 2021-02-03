package Lista6Ex3;

import Lista6Ex1.Pessoa;

//3. Considere, como subclasse da classe Pessoa,
//a classe Empregado. Considere que cada instância da classe Empregado tem,
//para além dos atributos que caracterizam a classe Pessoa,
//os atributos codigoSetor (inteiro), salarioBase (vencimento base) 
//e imposto (porcentagem retida dos impostos). Implemente a classe Empregado
//com métodos seletores e modificadores e um método calcularSalario.
//Escreva um programa de teste adequado para a classe Empregado. 

public class Empregado extends Pessoa {
	public int codigoSetor;
	private double salarioBase;
	private double imposto;

	public Empregado(String nome, String endereco, int telefone, int codigoSetor) {
		super(nome, endereco, telefone);
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	public double calcularSalario(double calcularSalario){
		this.imposto = imposto/100;
		this.imposto = this.salarioBase * this.imposto;
		calcularSalario = this.salarioBase - this.imposto;
	
		return  calcularSalario;
		
	}
}
