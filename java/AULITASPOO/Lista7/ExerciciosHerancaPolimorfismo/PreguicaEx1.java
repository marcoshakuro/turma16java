package ExerciciosHerancaPolimorfismo;
public class PreguicaEx1 extends AnimalEx1{

	
	public PreguicaEx1(String nome, String tipoAnimal, int idade) {
		super(nome, tipoAnimal, idade);
		
	}

	@Override
	public void emitirSom() {
		System.out.println(super.getNome()+" est� gritando");
		
	}
	
	@Override
	public void movimenta��o() {
		System.out.println(super.getNome()+" est� escalando uma arvore");
	}

}
