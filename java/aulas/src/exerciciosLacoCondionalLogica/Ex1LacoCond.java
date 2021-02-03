package ExerciciosLacoCondionalLogica;

import java.util.Scanner;

public class Ex1LacoCond {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int peso = 0, excesso = 0, multa = 0, continuar = 1;
		while (continuar == 1) {
			System.out.print("Insira o Valor do peso: ");
			peso = in.nextInt();
			if(peso > 50) {
				excesso = peso - 50;
				multa = excesso * 4;
				System.out.printf("O peso foi de %dKg, excesso foi de %dKg e a multa é de %d reais \n",peso, excesso,multa);
				System.out.print(" Deseja continuar? 1(sim) ou 2(não) \n");
				continuar = in.nextInt();
				}
				
			else {
				System.out.printf("O excesso foi de %d e a multa de %d, ou seja não excedeu o limite",excesso,multa);
			}
		}
		System.out.println("obrigado pela preferincia");
	}
}
