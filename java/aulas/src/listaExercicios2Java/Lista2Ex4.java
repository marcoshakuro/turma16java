package ListaExercicios2Java;
/*
 * Fa�a um programa em que permita a entrada de um n�mero
 *  qualquer e exiba se este n�mero � par ou �mpar. 
 *  Se for par exiba tamb�m a raiz quadrada do mesmo; 
 *  se for �mpar exiba o n�mero elevado ao quadrado.
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
			System.out.print("O numero 0 � neutro");
		}
		else if (num<0) {
			System.out.print("N�o entraremos em discu��o se � natural ou n�o");
		}
		else if (num % 2 == 0) {
			System.out.println("O numero  � par");
			raiz = Math.sqrt(num);
			System.out.printf("A raiz do numero � %.2f",raiz);
		}
		else {
			System.out.println("O numero  � impar");
			pot = Math.pow(num, 2);
			System.out.printf("O numero elevado ao quadrado � de %.2f",pot);
		}
	}

}