package aulas;

import java.util.Scanner;

/*8. O custo ao consumidor de um carro novo � a soma do custo de f�brica
 *  com a percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica). 
 *  Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
 *  escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor.*/

public class Fabrica8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double cusCon, valor1, valor2, cusFab, pD = 0.28, imposto = 0.45;
		System.out.println("Qual foi o Custo de Fabrica?");
		cusFab = in.nextDouble();
		
		valor1 = cusFab*imposto;
		valor2 = (cusFab+valor1)*pD;
		cusCon = (cusFab+valor1+valor2);
		
		System.out.printf("O custo ao consumidor ser� de R$ %.2f ",cusCon);
	}
}
