package ExerciciosCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Produto> lista = new ArrayList();
		int cod = 0;
		char op = 'S';
		int opcao = 0;

		do {
			System.out.println("selecione o deseja fazer\n 1-Adicionar produto\n"
					+ " 2-Remover Produto\n 3-Todos Produtos\n 4-Limpar Lista\n 5-Sair");
			opcao = in.nextInt();

			if (opcao == 1) {

				do {
					System.out.println("Digite o nome do produto que quer inserir");
					String produt = in.next();
					lista.add(cod, new Produto(produt));

					in.nextLine();
					System.out.println("deseja inserir algum mais? S/N");
					op = in.next().toUpperCase().charAt(0);

				} while (op == 'S');

			} else if (opcao == 2) {

				if (lista.isEmpty()) {
					System.out.println("ta vazio");
				} else {
					do {

						System.out.println("Codigo \t\t Nome");
						for (Produto prod : lista) {
							System.out.println(lista.indexOf(prod) + "\t\t" + prod.getNome());
						}

						System.out.println("Digite o codigo do produto que quer remover");
						lista.remove(in.nextInt());

						in.nextLine();
						System.out.println("deseja remover algum mais? S/N");
						op = in.next().toUpperCase().charAt(0);
						if (lista.isEmpty()) {
							System.out.println("ta vazio");
							break;
						}
					} while (op == 'S');
				}

			} else if (opcao == 3) {
				if (lista.isEmpty()) {
					System.out.println("ta vazio");
				} else {
					System.out.println("Sua lista atualmente");
					System.out.println("Codigo \t\t Nome");
					for (Produto prod : lista) {
						System.out.println(lista.indexOf(prod) + "\t\t" + prod.getNome());
					}
				}

			} else if (opcao == 4) {
				lista.clear();
				System.out.println("lista Limpa");

			} else if (opcao == 5) {
				op = 'E';
			}
		} while (op != 'E');
		in.close();
	}

}
