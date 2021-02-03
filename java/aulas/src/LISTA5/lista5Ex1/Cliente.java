package lista5Ex1;

//1) Crie uma classe cliente e apresente os atributos
//e métodos referentes esta classe, em seguida crie um
//objeto cliente, defina as instancias deste objeto e
//apresente as informações deste objeto no console.

public class Cliente {
	private String nome;
	private char sexo;
	private int cpf;
	
	public Cliente(String nome, int cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public char getSexo() {
		return this.sexo;
	}
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public int getCpf() {
		return this.cpf;
	}
	
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
}	


	