package DesafioDoProgramador;

import java.util.Scanner;

public class Salario {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double salario = 0, mediaSal = 0, mediaF = 0, maiorSalario = 0, totalS = 0, totalFilhos = 0, contadorValor100 = 0, percentualSalario100;
		int numeroF = 0;
		final int Habitantes = 4;
		for  (int giro=1; giro<=Habitantes; giro++){
			System.out.printf("Digite o salario do habitante "+ giro);
			salario = in.nextDouble();
			System.out.print("Digite o numero de filhos deste habitante: ");
			numeroF = in.nextInt();
		
			totalS = totalS + salario;
			totalFilhos = totalFilhos + numeroF;
			if (salario > maiorSalario){
				maiorSalario = salario;
			}
			if (salario <= 100){
				contadorValor100++;
			}
		}
		
		mediaSal = totalS / Habitantes;
		mediaF = totalFilhos / Habitantes;
		percentualSalario100 = ((contadorValor100 / Habitantes)*100.00);
		System.out.printf("Media salarial : R$ %.2f\n",mediaSal);
		System.out.printf("Media de filhos : %.2f\n",mediaF);
		System.out.printf("O maior salario informado foi %.2f\n",maiorSalario);
		System.out.printf("Número de pessoas que ganham até R$100 = %.2f sendo um percentual total de %.2f  \n",contadorValor100,percentualSalario100);
		System.out.print("Obrigado pela ajuda!!");
		
	}
}
