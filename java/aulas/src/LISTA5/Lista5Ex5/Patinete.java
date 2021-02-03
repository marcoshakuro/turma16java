package Lista5Ex5;

public class Patinete {
	public String cor;
	public String modelo;
	public boolean motorizado;
	
	public Patinete( boolean motorizado) {
		this.motorizado = motorizado;
	}
	
	void Ligado() {
		if (motorizado) {
			System.out.println("Esse patinete é motorizado e está ligado tome cuido");
			System.out.println("Sua cor é "+cor);
			modelo ="Patinete motorizado";
		}else {
			System.out.println("Esse patinete não é motorizado");
			System.out.println("Sua cor é "+cor);
			modelo = "Não motorizado";
		}
	}
}
