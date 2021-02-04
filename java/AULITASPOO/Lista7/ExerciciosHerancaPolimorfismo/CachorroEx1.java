package ExerciciosHerancaPolimorfismo;
public class CachorroEx1 extends AnimalEx1{
	
	
	
	public CachorroEx1(String nome, String tipoAnimal, int idade) {
		super(nome, tipoAnimal, idade);
		
	}

	@Override
	public void emitirSom() {
		System.out.println(super.getNome()+" está latindo alto");
		
	}
	
	@Override
	public void movimentação() {
		System.out.println(super.getNome()+" está correndo");
	}
	

}
