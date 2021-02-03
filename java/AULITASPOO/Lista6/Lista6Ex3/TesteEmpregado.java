package Lista6Ex3;

public class TesteEmpregado {
	public static void main(String[] args) {
		Empregado empregado = new Empregado("Fatima","Rua Austria", 1148383322, 312337);
		empregado.setSalarioBase(2500.0);
		empregado.setImposto(9.0);
		
		System.out.println("O nome do empregado é "+empregado.getNome()+" residida na "+empregado.getEndereco()
		+" sendo o codigo do setor "+empregado.codigoSetor+" e o telefone sendo "+empregado.getTelefone());
		
		System.out.println("E seu salario + impostos é "+empregado.calcularSalario(0));
		
	}

}
