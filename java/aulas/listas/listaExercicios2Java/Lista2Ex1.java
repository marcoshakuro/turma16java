package ListaExercicios2Java;

import java.util.Scanner;

/*
 * Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
 */
public class Lista2Ex1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A, B, C;
		
		System.out.print("Digite o valor A ");
		A = in.nextInt();
		
		System.out.print("Digite o valor B ");
		B = in.nextInt();
		
		System.out.print("Digite o valor C ");
		C = in.nextInt();
		
		if(A > B && A > C) {
			System.out.printf("O maior numero � o A %d ",A);
		}
		if(B > A && B > C) {
			System.out.printf("O maior numero � o B %d",B);
		}
		if(C > B && C > A) {
			System.out.printf("O maior numero � o C %d",C);
		}
		else {
			System.out.println("Os numero s�o Iguais");
		}
		
	}
		
}
