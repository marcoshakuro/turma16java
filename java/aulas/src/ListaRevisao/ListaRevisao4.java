package ListaRevisao;

public class ListaRevisao4 {
	public static void main(String[] args) {
		double res = 0, soma = 0, y = 0;
		
		for(double x = 1; x<= 99; x=x+2) {
			y++;
			res = x/y;
			soma += res;
		}
		System.out.println(soma);
	}

}
