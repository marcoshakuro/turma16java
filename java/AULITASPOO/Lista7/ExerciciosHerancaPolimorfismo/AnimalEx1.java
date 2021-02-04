package ExerciciosHerancaPolimorfismo;

public class AnimalEx1 {
	private String nome;
	private String tipoAnimal;
	private int idade;
	
	
	public AnimalEx1(String nome, String tipoAnimal, int idade) {
		super();
		this.nome = nome;
		this.tipoAnimal = tipoAnimal;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void emitirSom() {
		
	}
	
	public void movimentação() {
		
	}
	
}
