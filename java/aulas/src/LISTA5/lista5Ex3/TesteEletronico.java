package lista5Ex3;

public class TesteEletronico {
	public static void main(String[] args) {
		Eletronico Ps5 = new Eletronico();
		Ps5.setModelo("Playstation 5");
		Ps5.setCodigo(20191215);
		Ps5.cor = "Branca";
		
		Ps5.Liga();
		
		System.out.println("O modelo do eletronico � "+Ps5.getModelo()+" e o c�digo � "+Ps5.getCodigo()+" e a cor dele � "+Ps5.cor);
		
	}
}
