package Lista5Ex4;

public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Jorginho");
		funcionario.setCpf(292129129);
		funcionario.setFuncao("Desenvolvedor Java Junior");
		
		System.out.println("O "+funcionario.getNome()+" que é portador do cpf "+funcionario.getCpf()+" que trabalha na funçao de "+funcionario.getFuncao()+" agora faz parte da equipe da generation");
		
		
	}
}
