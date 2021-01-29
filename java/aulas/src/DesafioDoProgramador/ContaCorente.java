package DesafioDoProgramador;

//CC - DESEJA EMITI TALÃO S/N: SE SIM SÓ ACEITA ENTRE 1/3: 

import java.util.Scanner;

public class ContaCorente {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int talao = 0 ;
		char opcao = ' ';
		double saldo = 0.00, credito=0.00, debito=0.00,valorTalao = 0.00;
		char opcaoDC;
		char opcaoSN;
		String descricao;
		
		//linha(40);
		System.out.println("CONTA CORRENTE");
		//linha(40);
		//processos
		System.out.println("Deseja emitir um talão de cheque? ");
		opcao= in.next().toUpperCase().charAt(0);
		talao = talao + 1;
		do {
			if(opcao == 'S' ) {
				System.out.print("Digite o valor do talão de cheque :");
					valorTalao = in.nextDouble();
					if(valorTalao > 0 ) {
					talao = talao + 1;
					saldo = saldo + valorTalao ;
					}
					else {
							System.out.println("O Talao de cheque está em branco ou invalidado");
							
						}
					
					System.out.println("Deseja emitir outro talão de cheque? ");
					opcao= in.next().toUpperCase().charAt(0);
					
					 if (talao > 3) {
						System.out.println("limite de talões de cheque atingido, ação invalida");
						opcao = 'N';
				}
			}	
		}while(opcao == 'S');
		
		for (int giro=1; giro<=10; giro++)
		{
			
			System.out.printf("Lançamento %d : [D-débito/C-crédito] :",giro);
			opcaoDC = in.next().toUpperCase().charAt(0);
			if (opcaoDC =='D')
			{
				System.out.print("\nDigite o valor para débito :");
				debito = in.nextDouble();
				if (saldo > 0)
				{
					while (saldo < debito )
					{
						System.out.printf("Saldo indisponivel, atual %.2f, tente de novo!!!\n",saldo);
						System.out.print("Digite o valor para débito :");
						debito = in.nextDouble();
						
					}
					in.nextLine();
					System.out.print("Descrição do débito :");
					descricao = in.nextLine();
					saldo = saldo - debito;
					System.out.printf("Saldo atual é R$ %.2f \n", saldo);
				} 
				else if (saldo == 0) 
				{
					System.out.println("Você está sem saldo no momento, faça um crédito primeiro!!!");
				}
			}
			else if (opcaoDC == 'C')
			{
				System.out.print("\nDigite o valor do crédito: ");
				credito = in.nextDouble();
				while (credito <=0 )
				{
					System.out.print("Valor informado negativo ou zero, tente de novo:");
					System.out.print("Digite o valor do crédito: ");
					credito = in.nextDouble();
				}
				in.nextLine();
				System.out.print("Digite a descrição do crédito: ");
				descricao = in.nextLine();
				saldo = saldo + credito;
				System.out.printf("Saldo atual é R$ %.2f \n", saldo);
			}
			else
			{
				System.out.println("Você não escolheu Debito ou Crédito!!!");
			}
			
			System.out.print("Continua S/N :");
			opcaoSN = in.next().toUpperCase().charAt(0);
			if (opcaoSN == 'N')
			{
				break;
			}
		}

		System.out.println("Deseja emitir um talão de cheque? ");
		opcao= in.next().charAt(0);
		do {
			if(opcao == 'S') {
				System.out.print("Digite o valor do talão de cheque :");
					valorTalao = in.nextDouble();
					talao = talao + 1;
					saldo = saldo + valorTalao ;
					System.out.println("Deseja emitir outro talão de cheque? ");
					opcao= in.next().charAt(0);
			}
		}while(talao <= 3 && opcao == 'S');
		
	}
			

}
	

