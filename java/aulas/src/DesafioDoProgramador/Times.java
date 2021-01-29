package DesafioDoProgramador;

import java.util.Scanner;

//PAULISTINHA
// 0 - CORITHIANS, 1 - PALMEIRAS, 2 - SANTOS, 3 - SPFC
// PONTOS - INTEIRO - 4
// GANHA - 3 PONTOS
// PERDE - 0 PONTO
// EMPATA - 1 PONTO
// FAÇA UM PROGRAMA QUE PEÇA SE O CADA TIME G-GANHOU, P-PERDEU
// OU EMPATOU  EM 4 RODADAS, AO FINAL MOSTRA O NOME DE CADA TIME
// E SEUS RESPECTIVOS PONTOS
//CORINTHIANS - G-ganhou P-perdeu ou E-empatou [G/P/E]:
public class Times {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
				String times[] = {"CORITHIANS","PALMEIRAS","SANTOS","SPFC"};
				int pontos[] =  new int [4];
				char resposta;
				int j, p;
				for (j = 0; j<4; j++){
					System.out.println("Rodada "+(j+1)+"\n");
					for ( p = 0; p<4; p++){
						System.out.println(times[p]+" G-ganhou P-perdeu ou E-empatou [G/P/E]: ");
						resposta = in.next().toUpperCase().charAt(0);
						
						if (resposta == 'G'){
							pontos[p] = pontos[p]+3;
						}
						else if(resposta =='E'){
							pontos[p] = pontos[p]+1;
						}
						else if(resposta =='P'){
							pontos[p]= pontos[p]+0;
						}
					}
					System.out.println("\n");
					
				
				}
				System.out.println("\n");
				for (int z = 0; z< 4; z++)
				{
					System.out.println(times[z]+" finalizou com "+pontos[z]+" pontos.\n");	
		}
	}
}
// escolher  o time para ver o a soma das pontuações
