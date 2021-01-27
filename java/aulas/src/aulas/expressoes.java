package aulas;

import java.util.Scanner;
import java.math.*;

/*4*/

public class expressoes {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double A=0, B=0, C=0, R, S, D;
		
		System.out.print("insira valor A: ");
		A=ler.nextInt();
		System.out.print("insira valor B: ");
		B=ler.nextInt();
		System.out.print("insira valor C: ");
		C=ler.nextInt();
		
		R=Math.pow((A+B), 2);
		S=Math.pow((B+C),2);
		D= (R + S) / 2;
		
		System.out.printf("O valor de A é %.2f o de B é %.2f e o de C %.2f, o valor de R é %.2f, o valor do S é %.2f e o do D é de %.2f",A,B,C,R,S,D);

	}
}
