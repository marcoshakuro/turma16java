package lista5Ex2;
//2) Crie uma classe avi�o e apresente os atributos
//e m�todos referentes esta classe, em seguida crie
//um objeto avi�o, defina as instancias deste objeto
//e apresente as informa��es deste objeto no console.

public class TesteAviao {
	public static void main(String[] args) {
		Aviao meuAviao = new Aviao();
		meuAviao.cor = "Preta";
		meuAviao.setModelo("boing");
		meuAviao.setNumeroPassageiros(400);
		
		System.out.println("O meu avi�o � da cor "+meuAviao.cor+" o modelo � "+meuAviao.getModelo()+" que cabem "+meuAviao.getNumeroPassageiros()+ " passageiros");
		
		
	}
}
