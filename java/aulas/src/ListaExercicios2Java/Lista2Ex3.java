package ListaExercicios2Java;

import java.util.Scanner;

/*Fa�a um programa que receba a idade de uma pessoa e
 mostre na sa�da em qual categoria ela se encontra:
	10-14 infantil
	15-17 juvenil
	18-25 adulto*/
public class Lista2Ex3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int id;
		System.out.print("Idade por favor :");
		id = in.nextInt();
		
		if (id < 10) {
			System.out.println("Voc� � muito novo para quaisquer categoria");
		}
		else if (id <= 14) {
			System.out.println("Voc� � da Categoria Infantil");
		}
		else if (id <= 17) {
			System.out.println("Voc� � da Categoria Juvenil");
		}
		else if (id <= 25) {
			System.out.println("Voc� � da Categoria Adulto");
		}
		else {
			System.out.println("Voc� est� acima da idade maxima permitida");
		}
	}
}
