package aulas;
/*1. Faça um sistema que leia a idade de uma pessoa
expressa em anos, meses e dias e mostre-a expressa
apenas em dias.*/
import java.util.Scanner;

public class AnosEmDias {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int ano, mes, dia, idade;
		System.out.print("Digite sua idade: ");
		idade = ler.nextInt();
		System.out.print("Digite quantidade de meses: ");
		idade = ler.nextInt();
		System.out.print("Digite quantidade de dias: ");
		idade = ler.nextInt();
		
		ano = idade*365;
		mes = idade*30;
		dia = idade*1;
		
		System.out.printf("Sua idade é de %d dia(s)",(ano+mes+dia) );
		
	}

}
