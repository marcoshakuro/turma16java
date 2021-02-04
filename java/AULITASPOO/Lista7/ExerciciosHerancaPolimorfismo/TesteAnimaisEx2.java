package ExerciciosHerancaPolimorfismo;

import java.util.Scanner;

public class TesteAnimaisEx2 {
	public static void main(String[] args) {
		char op;
		Scanner in = new Scanner(System.in);
		AnimalEx1 dog = new CachorroEx1(" ","Cachorro", 0);
		AnimalEx1 cavalo = new CavaloEx1(" ","Cavalo", 0);
		AnimalEx1 preguica = new PreguicaEx1(" ","Preguiça", 0);
		
		do {
			System.out.println("Qual o Animal que deseja? 1-"+dog.getTipoAnimal()+" 2-"
					+cavalo.getTipoAnimal()+" 3-"+preguica.getTipoAnimal());
			int tipoAnimal = in.nextInt();
			
			if(tipoAnimal == 1) {
				in.nextLine();
				System.out.println("Qual o nome do cachorro?");
				dog.setNome(in.nextLine());
				
				System.out.println("Qual a idade de "+dog.getNome()+"?");
				dog.setIdade(in.nextInt());
				
				dog.emitirSom();
				
				dog.movimentação();
				System.out.println();
				
			}else if (tipoAnimal == 2) {
				in.nextLine();
				System.out.println("Qual o nome do cavalo?");
				cavalo.setNome(in.nextLine());
				
				System.out.println("Qual a idade de "+cavalo.getNome()+"?");
				cavalo.setIdade(in.nextInt());
				
				cavalo.emitirSom();
				
				cavalo.movimentação();
				System.out.println();
				
			}else if(tipoAnimal == 3) {
				in.nextLine();
				System.out.println("Qual o nome da preguiça?");
				preguica.setNome(in.nextLine());
				
				System.out.println("Qual a idade de "+preguica.getNome()+"?");
				preguica.setIdade(in.nextInt());
				
				preguica.emitirSom();
				
				preguica.movimentação();
				System.out.println();
			}
				
			System.out.println("Deseja escolher outro animal? S/N");
			op = in.next().toUpperCase().charAt(0);
		}while(op == 'S');
		
		System.out.println("Obrigado volte sempre!!");
		in.close();

	}
}
