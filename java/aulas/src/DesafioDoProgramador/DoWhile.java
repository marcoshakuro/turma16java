package DesafioDoProgramador;

import java.util.Scanner;

/* 2- Faça um programa que pegue um número do teclado e calcule
 *  a soma de todos os números  de 1 até ele. Ex.: o usuário entra
 *   7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.*/

public class DoWhile {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int contador = 0, soma = 0, z = 0;

		System.out.print("Digite um numero :");
		contador = in.nextInt();
		
		do{
			contador++;
		if(contador <= 1) {
			System.out.print(x);
		}
		else {
			System.out.print("+"+x);
		}
			soma = soma + contador;
			
		}while(contador < soma);
		System.out.print("="+soma);
	}
}

/*
 * public class DoWhile {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int x, y = 1, z = 0;

		System.out.print("Digite um numero :");
		x = in.nextInt();
		
		if(x == 0) {
			y=0;
		}
		
		do{
			z=z+y;
			y=y+1;	
			
		}while(x >= y);
		System.out.print("A soma é de :"+z);
	}
}
 * 
*/
