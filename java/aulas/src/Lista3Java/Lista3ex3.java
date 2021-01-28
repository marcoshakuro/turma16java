package Lista3Java;

import java.util.Scanner;

/* Solicitar a idade de várias pessoas e imprimir:
 * Total de pessoas com menos de 21 anos. Total de
 * pessoas com mais de 50 anos. O programa termina
 * quando idade for =-99. (WHILE)*/

public class Lista3ex3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int idade = 0, totalVin = 0, totalCin = 0;
		
		while(idade != -99) {
			System.out.print("Informe sua idade por favor(ou use -99 para finalizar) :");
			idade = in.nextInt();
				if(idade <= 0) {
					System.out.print("Idade invalida\n");
				}
				else if(idade < 21 ) {
					totalVin++;
					System.out.print("Obrigado pela informação\n");
				}
				else if (idade > 50) {
					totalCin++;
					System.out.print("Obrigado pela informação\n");
				}
				else if (idade >= 21 || idade <= 50) {
					System.out.print("Obrigado pela informação\n");
				}
				else {
					System.out.print("Numero invalido, digite -99 para parar");
				}
		}
		System.out.print("O total de pessoas com idade inferior a 21 anos é de "+totalVin++ +", o total de pessoas com idade superior a 50 anos é de "+totalCin++);
	}
}
