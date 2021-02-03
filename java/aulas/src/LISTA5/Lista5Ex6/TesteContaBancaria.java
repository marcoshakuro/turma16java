package Lista5Ex6;

public class TesteContaBancaria {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria();
		conta.setNome("Marcos dos Santos");
		conta.setCpf(144593433);
		conta.setConta(193312);
		
		System.out.println(conta.getNome()+" do respectivo cpf "+conta.getCpf()+" sua conta bancaria é "+conta.getConta());
	}

}
