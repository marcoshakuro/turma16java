package Lista5Ex4;
//4) Crie uma classe funcion�rio e apresente os atributos
//e m�todos referentes esta classe, em seguida crie um objeto
//funcion�rio, defina as instancias deste objeto e apresente as
//informa��es deste objeto no console.

public class Funcionario {
	private String nome;
	private String funcao;
	private int cpf;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	
}
