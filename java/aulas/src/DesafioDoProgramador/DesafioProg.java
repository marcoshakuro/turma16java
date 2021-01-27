package DesafioDoProgramador;

import java.util.Scanner;

public class DesafioProg {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		System.out.print("Digite um numero natural: ");
		num = in.nextInt();
		
		if(num==0) {
			System.out.print("O numero 0 é neutro");
		}
		else if (num<0) {
			System.out.print("Não entraremos em discução se é natural ou não");
		}
		else if (num % 2 == 0) {
			System.out.print("O numero  é par");
		}
		else {
			System.out.print("O numero  é impar");
		}
	}

}
