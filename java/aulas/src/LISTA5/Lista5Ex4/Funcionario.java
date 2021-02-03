package Lista5Ex4;
//4) Crie uma classe funcionário e apresente os atributos
//e métodos referentes esta classe, em seguida crie um objeto
//funcionário, defina as instancias deste objeto e apresente as
//informações deste objeto no console.

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
