package Lista3Java;

/*Informar todos os números de 1000 a 1999 que quando
 *  divididos por 11 obtemos resto = 5. (FOR)*/

public class Lista3Ex1 {
	public static void main(String[] args) {
		int resto = 0;
		
		for(int numeros = 1000; numeros <= 1999; numeros++){
			resto = numeros % 11;
			
			if(resto == 5) {
				System.out.println(numeros);
			}
		}
	}
}
