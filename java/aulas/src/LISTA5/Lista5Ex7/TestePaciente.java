package Lista5Ex7;

public class TestePaciente {

	public static void main(String[] args) {
		Paciente paciente = new Paciente();
		paciente.setNome("João Peninha");
		paciente.setCpf(122332343);
		paciente.terminal = false;
		
		paciente.tipoDoença();
		
		System.out.println("O Paciente "+paciente.getNome()+" que tem o cpf "+paciente.getCpf()+" esta com "+paciente.getDoenca());
		
				
	}

}
