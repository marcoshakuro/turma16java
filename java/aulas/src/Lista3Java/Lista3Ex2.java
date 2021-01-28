package Lista3Java;

import java.util.Scanner;

/*
 * Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
 */
public class Lista3Ex2 {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int quantidadeNumerosPares = 0, quantidadeNumerosImpares = 0, numero = 0;
//			System.out.print("digite um numero :");
//			i = in.nextInt();
			for( int i = numero; i < 10; i++) {
				System.out.print("digite um numero :");
				numero  = in.nextInt();
				if(numero % 2 == 0) {
					//System.out.print("par(es) "+x+"\n");
					quantidadeNumerosPares++;
				}
				else {
					//System.out.print("impar(es) "+x+"\n");
					quantidadeNumerosImpares++;
			}
		}
			System.out.print("quantidade de numeros par(es) :"+quantidadeNumerosPares+" quantidade de numeros impar(es) :"+quantidadeNumerosImpares);
	}
}