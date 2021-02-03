package lista5Ex1;

//1) Crie uma classe cliente e apresente os atributos
//e métodos referentes esta classe, em seguida crie um
//objeto cliente, defina as instancias deste objeto e
//apresente as informações deste objeto no console.

public class TesteCliente {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Marcos dos Santos",450002220);
		cliente1.setSexo('M');
		
		Cliente cliente2 = new Cliente("Leonardo dos Santos",10022233);
		cliente2.setSexo('M');
		
		
		System.out.printf("Seu nome é "+cliente1.getNome()+" CPF "+cliente1.getCpf()+" do sexo "+cliente1.getSexo());
		System.out.printf("\nSeu nome é "+cliente2.getNome()+" CPF "+cliente2.getCpf()+" do sexo "+cliente2.getSexo());
	}
}
