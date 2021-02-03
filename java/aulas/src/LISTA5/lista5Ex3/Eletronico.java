package lista5Ex3;
//3) Crie uma classe produto eletrônico e apresente
//os atributos e métodos referentes esta classe,
//em seguida crie um objeto produto eletrônico,
//defina as instancias deste objeto e apresente as informações deste objeto no console.

public class Eletronico {
	public String cor;
	private String modelo;
	private int codigo;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	void Liga() {
		System.out.println("O PS5 está Ligado!!");
	}
	
	
	

}
