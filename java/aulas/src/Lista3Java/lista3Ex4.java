package Lista3Java;

import java.util.Scanner;

/*Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma
das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros),
e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva).
Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
o número de pessoas calmas; 
o número de mulheres nervosas; 
o número de homens agressivos; 
o número de outros calmos;
o número de pessoas nervosas com mais de 40 anos; 
o número de pessoas calmas com menos de 18 anos.*/
public class lista3Ex4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int pessoas = 0, idade = 0, sexo = 0, opcao = 0, pessoasCalmas = 0, mulheresNervosas = 0, homensAgressivos = 0, outrosCalmos = 0, pessoasNervosas40 = 0, pessoasCalmas18  = 0;
		//Mudar para um numero menor para realizar teste.		
		while(pessoas < 150) {
			System.out.print("Informe sua idade por favor :");
			idade = in.nextInt();
			System.out.print("Digite o numero e informe seu genero por favor (1-M ; 2-F ; 3-Outros) :");
			sexo = in.nextInt();
			System.out.print("Digite o numero e infome se você se considera uma pessoa: 1-Calma ; 2-Nervosa ; 3-Agressiva) : ");
			opcao = in.nextInt();
			
			if(opcao == 1) {
				pessoasCalmas++;
				if (sexo == 3) {
					outrosCalmos++;
					if(idade < 18) {
						pessoasCalmas18++;
					}
				}
				
			}
			if(opcao == 2) {
				if(sexo == 2) {
					mulheresNervosas++;
				}
				else if(idade > 40) {
					pessoasNervosas40++;	
				}
			}
			
			if(opcao == 3 && sexo == 1) {
				homensAgressivos++;
			}
			pessoas++;
		}	
		System.out.print("O número de pessoas calmas foi de :"+pessoasCalmas);
		System.out.print("O número de mulheres nervosas foi de :"+mulheresNervosas);
		System.out.print("O número de homens agressivos foi de :"+homensAgressivos);
		System.out.print("O número de outros calmos foi de :"+outrosCalmos);
		System.out.print("O número de pessoas nervosas com mais de 40 anos foi de :"+pessoasNervosas40);
		System.out.print("O número de pessoas calmas com menos de 18 anos foi de :"+pessoasCalmas18);
		in.close();
	}
}
