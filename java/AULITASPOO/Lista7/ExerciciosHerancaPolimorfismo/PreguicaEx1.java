package ExerciciosHerancaPolimorfismo;
public class PreguicaEx1 extends AnimalEx1{

	
	public PreguicaEx1(String nome, String tipoAnimal, int idade) {
		super(nome, tipoAnimal, idade);
		
	}

	@Override
	public void emitirSom() {
		System.out.println(super.getNome()+" está gritando");
		
	}
	
	@Override
	public void movimentação() {
		System.out.println(super.getNome()+" está escalando uma arvore");
	}

}
