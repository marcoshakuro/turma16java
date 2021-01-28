package Lista3Java;

import java.util.Scanner;

/* Crie um programa que leia um número do teclado até que encontre
 *  um número igual a zero. No final, mostre a soma dos números digitados.
 *  (DO...WHILE)*/

public class lista3Ex5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numero = 0, soma = 0;
		
		do {
			System.out.print("Digite um numero: ");
			numero = in.nextInt();
			soma += numero;
			
		}while(numero != 0); {
			
		System.out.println("A soma dos numero é: "+soma);
		}
	}
}
