package Lista4Vetores;

import java.util.Random;
import java.util.Scanner;

public class Lista4VetoresEx2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		
		int valorDado [] = new int [10];
		int maiorValor = 0;
		double valorTotal = 0.00, contador = 0.00, media = 0.00;
		
		for(int x = 0; x < 10; x++) {
			valorDado[x] =  r.nextInt(6)+1;
			System.out.println("Valores dos lançamentos "+valorDado[x]);
			
		}
		for(int x = 0; x < 10 ; x++) {
			valorTotal = valorTotal + valorDado[x];
			
			if(valorDado[x] >= maiorValor) {
				if(valorDado[x] == maiorValor) {
					contador++;
				}
				else {
					contador = 1.0;
				}
				maiorValor = valorDado[x];
			}
			media = valorTotal / 10;
		}System.out.println("O valor total é "+valorTotal);
		 System.out.println("A media foi de "+media);
		 System.out.println("O maior valor apareceu "+contador);
		 in.close();
	}
}
