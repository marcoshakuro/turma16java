package Lista6Ex1;
//1. Cria uma Classe Pessoa, contendo os atributos encapsulados,
//com seus respectivos seletores (getters) e modificadores (setters),
//e ainda o construtor padr�o e pelo menos mais duas op��es de construtores
//conforme sua percep��o. Atributos: String nome; String endere�o; String telefone; 

public class Pessoa {
	
	private String nome;
	private String endereco;
	private int telefone;
	
//	public Pessoa() {
//		
//	}

	public Pessoa(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	public Pessoa(String nome, String endereco, int telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
}
