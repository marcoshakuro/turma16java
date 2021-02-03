package aulas;

import java.util.Scanner;

/*5. Faça um sistema que leia as 3 notas de um aluno e calcule
 *  a média final deste aluno. Considerar que a média é ponderada
 *   e que o peso das notas é: 2,3 e 5, respectivamente. */
public class Notas {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double nota1, nota2, nota3, notaF;
		
		System.out.print("Qual a primeira nota : ");
		nota1 = ler.nextInt();
		System.out.print("Qual a segunda nota : ");
		nota2 = ler.nextInt();
		System.out.print("Qual a terceira nota : ");
		nota3 = ler.nextInt();
		
		notaF = ((nota1*0.2)+(nota2*0.3)+(nota3*0.5)/3);
		
		System.out.printf("A media Final é de %.2f",notaF);
				
	}

}
