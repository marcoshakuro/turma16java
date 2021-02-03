package ListaExercicios2Java;
/*
 * Faça um programa em que permita a entrada de um número
 *  qualquer e exiba se este número é par ou ímpar. 
 *  Se for par exiba também a raiz quadrada do mesmo; 
 *  se for ímpar exiba o número elevado ao quadrado.
 */
import java.util.Scanner;

public class Lista2Ex4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		double raiz,pot;
		System.out.print("Digite um numero natural: ");
		num = in.nextInt();
		
		if(num==0) {
			System.out.print("O numero 0 é neutro");
		}
		else if (num<0) {
			System.out.print("Não entraremos em discução se é natural ou não");
		}
		else if (num % 2 == 0) {
			System.out.println("O numero  é par");
			raiz = Math.sqrt(num);
			System.out.printf("A raiz do numero é %.2f",raiz);
		}
		else {
			System.out.println("O numero  é impar");
			pot = Math.pow(num, 2);
			System.out.printf("O numero elevado ao quadrado é de %.2f",pot);
		}
	}

}