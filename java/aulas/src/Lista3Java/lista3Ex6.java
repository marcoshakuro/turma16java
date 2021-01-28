package Lista3Java;

import java.util.Scanner;

/* Escrever um programa que receba vários números inteiros no teclado.
 *  E no final imprimir a média dos números múltiplos de 3.
 *   Para sair digitar 0(zero).(DO...WHILE)*/
public class lista3Ex6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numero = 0; 
		double soma = 0, contador = 0, media = 0;
		
		do {
			System.out.print("Digite um numero: ");
			numero = in.nextInt();
			
			if((numero%3) == 0 && numero != 0) {
				
				soma += numero;
				contador ++;
			}
			
		}while(numero != 0); 
		if(contador != 0) {
			
			media = soma/contador;
			System.out.println("A media dos numeros multiplos de 3 é : "+media);
		}
		else {
			System.out.println("Sem numeros multiplos de 3 para tirar a media");
		}
			
		
		
	}
}


