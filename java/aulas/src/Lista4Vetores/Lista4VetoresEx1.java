package Lista4Vetores;

import java.util.Scanner;

public class Lista4VetoresEx1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int valor[] = new int [5];
		int maiorValor = 0, contador = 0;
		
		for (int x = 0 ; x < 5; x++) {
			System.out.print("Digite pontuação da atividade "+ (x+1) +" :");
			valor[x] = in.nextInt();
				
				if(valor[x] >= maiorValor) {
					if(valor[x] == maiorValor) {
						
						contador++;
					}
					else {
						contador = 1;
					}
					maiorValor = valor[x];
				}
			System.out.println("O valor é de "+valor[x]+"\n");
		}
		
		System.out.println("O maior valor é "+maiorValor);
		in.close();
	}
}
