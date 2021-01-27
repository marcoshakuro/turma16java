package ListaRevisao;


import java.util.Scanner;

/*Escrever um programa que leia uma quantidade desconhecida
de números e conte quantos deles estão nos seguintes intervalos:
[0-25], [26-50], [51-75] e [76-100]. A entrada de dados deve terminar quando
for lido um número negativo.*/

public class ListaRevisao3 {     
     
	public static void main(String[] args){  
		Scanner in = new Scanner(System.in);
		int valor1 = 0, valorLido1 = 0, valorLido2 = 0, valorLido3 = 0, valorLido4 = 0;
		while(valor1 >= 0){
			System.out.print("Forneça um valor ");
			valor1 = in.nextInt();
			if(valor1>=0 || valor1 <= 25){
				valorLido1++;	//valorLido=valorLido+1
				System.out.println(valorLido1);
				}
				else 
					if(valor1>=26 || valor1 <= 50){
					valorLido2++;
					System.out.println(valorLido2);
					}
					else 
						if(valor1>=51 || valor1 <= 75){
						valorLido3++;
						System.out.println(valorLido3);
						}
						else 
							if (valor1>=76 || valor1 <= 100){
							valorLido4++;
							System.out.println(valorLido4);
						}
					}
				} 
		}
		
	 
