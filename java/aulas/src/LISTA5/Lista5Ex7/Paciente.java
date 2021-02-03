package Lista5Ex7;

public class Paciente {
	private String doenca;
	private String nome;
	public boolean terminal;
	private int cpf;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getDoenca() {
		return doenca;
	}
	public void setDoenca(String doenca) {
		this.doenca = doenca;
	}
	
	
	void tipoDoença() {
		if(terminal) {
			System.out.println("Sinto muito mesmo!!!!");
			doenca = "Cancer";
		}else {
			System.out.println("Fique tranquilo está tudo bem!!!" );
			doenca = "Gripe";
		}
	}
}
