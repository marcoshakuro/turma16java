package ExerciciosHerancaPolimorfismo;
public class CavaloEx1 extends AnimalEx1{

	
	
	public CavaloEx1(String nome, String tipoAnimal, int idade) {
		super(nome, tipoAnimal, idade);
		
	}

	@Override
	public void emitirSom() {
		System.out.println(super.getNome()+" está relinchando");
		
	}
	
	@Override
	public void movimentação() {
		System.out.println(super.getNome()+" está galopando rapido");
	}
	
}
