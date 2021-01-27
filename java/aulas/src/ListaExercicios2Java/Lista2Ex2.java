package ListaExercicios2Java;

import java.util.Scanner;

/*
 * Faça um programa que entre com três números e coloque em ordem crescente.

 */
public class Lista2Ex2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A, B, C, menor = 0, meio = 0, maior = 0;
		
		System.out.print("Digite o valor A ");
		A = in.nextInt();
		
		System.out.print("Digite o valor B ");
		B = in.nextInt();
		
		System.out.print("Digite o valor C ");
		C = in.nextInt();
		
		if(A >= B && A >= C) {
			maior = A;
			if(B >= C) {
				meio = B;
				menor= C;
			} else {
				meio = C;
				menor = B;
			}
		}
		else if (B >= A && B >= C) {
			maior = B;
			if(A >= C) {
				meio = A;
				menor = C;
			} else {
				meio = C;
				menor = A;	
			}
		}
		else if (C >= A && C >= B) {
			maior = C;
			if(A >= B) {
				meio = A;
				menor = B;
			} else {
				meio = B;
				menor = A;		
			}
		}
		System.out.printf("Ordem Crescente %d  %d  %d",menor,meio,maior);
		
	}
}