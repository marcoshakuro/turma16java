package aulas;

import java.util.Scanner;

public class Equações {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double a,b,c,d,e,f,valorX,valorY;
		
		System.out.print("Qual o valor de a : ");
		a = ler.nextDouble();
		System.out.print("Qual o valor de a : ");
		b = ler.nextDouble();
		System.out.print("Qual o valor de a : ");
		c = ler.nextDouble();
		System.out.print("Qual o valor de a : ");
		d = ler.nextDouble();
		System.out.print("Qual o valor de a : ");
		e = ler.nextDouble();
		System.out.print("Qual o valor de a : ");
		f = ler.nextDouble();
		
		valorX = (c*e)-(b*f) / (a*e)-(b*d);
		valorY = (a*f)-(c*d) / (a*e)-(b*d);
		
		System.out.printf("O valor de x é de %.2f e o de y é de %.2f",valorX,valorY);
	}

}
