package aulas;

import java.util.Scanner;

public class exercicio6 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double x1, x2, y1, y2, valor1, valor2, valorTotal;
	
		System.out.print("Qual o valor de x1 : ");
		x1 = ler.nextDouble();
		System.out.print("Qual o valor de x2 : ");
		x2 = ler.nextDouble();
		System.out.print("Qual o valor de y1 : ");
		y1 = ler.nextDouble();
		System.out.print("Qual o valor de y2 : ");
		y2 = ler.nextDouble();
		
		valor1 = Math.pow((x2-x1), 2);
		valor2 = Math.pow((y2-y1), 2);
		
		valorTotal = Math.sqrt(valor1+valor2);
		
		System.out.printf("O valor de D é %.2f",valorTotal);
	}
}
