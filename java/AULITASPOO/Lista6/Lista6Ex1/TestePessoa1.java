package Lista6Ex1;

public class TestePessoa1 {

	public static void main(String[] args) {
		
			Pessoa pessoa1 = new Pessoa(null, null);
			pessoa1.setNome("Jorge");
			pessoa1.setEndereco("Rua dos economistas Nº34");
			pessoa1.setTelefone(943484);

			System.out.println("Meu nome é " + pessoa1.getNome() + " moro na rua " + pessoa1.getEndereco()
					+ " e meu telefone é " + pessoa1.getTelefone());

	}

}
