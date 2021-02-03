package Lista6Ex4;

public class TesteAdministrador {
	public static void main(String[] args) {
		Administrador adm = new Administrador("Jean", "Rua Japao", 150.0);
		double valor =300.0;
		double valor2 = 200.0;
		double soma = 0;
		
		soma = (valor + valor2) - adm.getAjudaDeCusto();
		
		System.out.println("O valor da viagem ficou em R$"+soma
				+ " e a ajuda de custo que o administrador ofereceu foi de R$"+adm.getAjudaDeCusto());
		
		
	}
}
