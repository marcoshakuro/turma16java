package DesafioDoProgramador;

//CC - DESEJA EMITI TAL�O S/N: SE SIM S� ACEITA ENTRE 1/3: 

import java.util.Scanner;

public class ContaCorente {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double saldo = 0.00;
		int talao = 0;
		char opcao = ' ';
//		System.out.println("Selecione o movimento (1-Debito;2-Credito");
//		opcao = in.next().charAt(0);
		
		do {
		System.out.println("Deseja emitir um tal�o de cheque? ");
		opcao= in.next().charAt(0);
		talao = talao + 1;
		
		}while(talao <= 3 && opcao == 'S');
		
	}
			
}

