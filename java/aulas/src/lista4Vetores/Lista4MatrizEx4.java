package Lista4Vetores;

//import java.util.Random;
import java.util.Scanner;

public class Lista4MatrizEx4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//Random r = new Random();
		final int MATRIZ = 3;
		int cubo[][]= new int [MATRIZ][MATRIZ];
		int soma = 0;
		
		for(int l = 0;l < MATRIZ; l++){
			for(int c = 0;c < MATRIZ; c++){
				
				System.out.print("Insira um valor cubo :");
				cubo[l][c] = in.nextInt();
			    //cubo[l][c] = r.nextInt();
				if (l == c) {
					soma += cubo[l][c];
				}
				System.out.println(cubo[l][c]+" ");
			}
			System.out.println("\n");
		}
		System.out.println("A soma da diagonal princial é "+soma);
		in.close();
	}
}
