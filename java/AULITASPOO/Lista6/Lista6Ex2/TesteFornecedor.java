package Lista6Ex2;

public class TesteFornecedor {
	public static void main(String[] args) {
	Fornecedor fornecedor = new Fornecedor("João", "Rua Capitao Jose galo",923234545);
	fornecedor.setValorCredito(1000.00);
	fornecedor.setValorDivida(800.00);
	
	System.out.println("O nome do fornecedor é "+fornecedor.getNome()+" localizado na "+fornecedor.getEndereco()+" telefone para contato :"+fornecedor.getTelefone() );
	
	System.out.println("O saldo atual do fornecedor é : R$"+fornecedor.obterSaldo(0));

	}
}
