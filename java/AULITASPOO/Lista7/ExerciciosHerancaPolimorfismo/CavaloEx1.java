package ExerciciosHerancaPolimorfismo;
public class CavaloEx1 extends AnimalEx1{

	
	
	public CavaloEx1(String nome, String tipoAnimal, int idade) {
		super(nome, tipoAnimal, idade);
		
	}

	@Override
	public void emitirSom() {
		System.out.println(super.getNome()+" est� relinchando");
		
	}
	
	@Override
	public void movimenta��o() {
		System.out.println(super.getNome()+" est� galopando rapido");
	}
	
}
