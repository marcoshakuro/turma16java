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
			System.out.println("Esse patinete � motorizado e est� ligado tome cuido");
			System.out.println("Sua cor � "+cor);
			modelo ="Patinete motorizado";
		}else {
			System.out.println("Esse patinete n�o � motorizado");
			System.out.println("Sua cor � "+cor);
			modelo = "N�o motorizado";
		}
	}
}
