package aulas;
/*3. Faça um sistema que leia o tempo de duração de um evento em
 *  uma fábrica expressa em segundos e mostre-o expresso em horas,
 *   minutos e segundos. */
import java.util.Scanner;

public class segundosEmHoras {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int hrs, min, seg, segundos;
		
		System.out.print("Digite o tempo em segundos: ");
		segundos = ler.nextInt();
		
		hrs = segundos/3600;
		min = (segundos%3600)/60;
		seg = (segundos%3600)%60;
		
		System.out.printf("seu evento tem %d hora(s) %d min e %d segundo(s)", hrs, min, seg);
		
	}
}
