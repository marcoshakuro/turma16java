package Lista4Vetores;

import java.util.Scanner;

public class Lista4MatrizesEx3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N1[][]= new int [4][6];
		int N2[][]= new int [4][6];
		int M1[][]= new int [4][6];
		int M2[][]= new int [4][6];
		
		for(int l = 0;l < 4; l++){
			for(int c = 0;c < 6; c++){
				
				System.out.print("Escolha um valor N1 :");
				N1[l][c] = in.nextInt();
			}
		}
		for(int l = 0;l < 4; l++){
			for(int c = 0;c < 6; c++){
				
				System.out.print("Escolha um valor N2 :");
				N2[l][c] = in.nextInt();
			}
		}
		System.out.println();
		for(int l = 0;l < 4; l++)
		{
			for(int c = 0;c < 6; c++)
			{
				M1[l][c]=N1[l][c]+N2[l][c];

				System.out.print(M1[l][c]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int l = 0;l < 4; l++)
		{
			for(int c = 0;c < 6; c++)
			{
				M2[l][c]=N1[l][c]-N2[l][c];

				System.out.print(M2[l][c]+" ");
			}
			System.out.println();
			in.close();
		}
	}
}
