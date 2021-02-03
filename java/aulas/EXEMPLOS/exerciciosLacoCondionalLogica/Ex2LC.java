package ExerciciosLacoCondionalLogica;

import java.util.Scanner;

public class ex2LC {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double c = 0, n = 0, e = 0, s = 0, sT = 0;
		
		System.out.print("Digite seu código :");
		c = in.nextDouble();
		
		System.out.println("Digite o numero de horas que trabalhou :");
		n = in.nextDouble();
		
		if(n > 50) {
			s = n * 10;
			e = (n - 50) * 20;
			sT = s + e;
			System.out.printf("O salario total é de %.2f e o salario excendente é de %.2f",sT,e);
		}
		else {
			s = n * 10;
			e = 0;
			System.out.printf("Seu salario total é de %.2f reais", s);
		}
	}

}
