package aulas;
/*2. Faça um sistema que leia a idade de uma
pessoa expressa em dias e mostre-a expressa em anos,
 meses e dias. */
import java.util.Scanner;

public class diasEmAnos {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int ano, mes, dia, dias;
		
		System.out.print("Digite sua idade em dias: ");
		dias = ler.nextInt();
		
		ano = dias/365;
		mes = (dias%365)/30;
		dia = (dias%365)%30;
		
		System.out.printf("Sua idade é de %d ano(s) %d mes(es) e %d dia(s)",ano,mes,dia);
		
	}
}
