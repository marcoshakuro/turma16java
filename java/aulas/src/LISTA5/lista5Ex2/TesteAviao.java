package lista5Ex2;
//2) Crie uma classe avião e apresente os atributos
//e métodos referentes esta classe, em seguida crie
//um objeto avião, defina as instancias deste objeto
//e apresente as informações deste objeto no console.

public class TesteAviao {
	public static void main(String[] args) {
		Aviao meuAviao = new Aviao();
		meuAviao.cor = "Preta";
		meuAviao.setModelo("boing");
		meuAviao.setNumeroPassageiros(400);
		
		System.out.println("O meu avião é da cor "+meuAviao.cor+" o modelo é "+meuAviao.getModelo()+" que cabem "+meuAviao.getNumeroPassageiros()+ " passageiros");
		
		
	}
}
