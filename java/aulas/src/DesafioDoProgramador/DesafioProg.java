package DesafioDoProgramador;

import java.util.Scanner;

public class DesafioProg {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		System.out.print("Digite um numero natural: ");
		num = in.nextInt();
		
		if(num==0) {
			System.out.print("O numero 0 � neutro");
		}
		else if (num<0) {
			System.out.print("N�o entraremos em discu��o se � natural ou n�o");
		}
		else if (num % 2 == 0) {
			System.out.print("O numero  � par");
		}
		else {
			System.out.print("O numero  � impar");
		}
	}

}
