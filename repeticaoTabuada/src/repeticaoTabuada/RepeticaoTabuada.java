package repeticaoTabuada;

import java.util.Scanner;

public class RepeticaoTabuada {

	public static void main(String[] args) {
		
		int multiplicador, total;
		int multiplicando= 0;
		
		System.out.println("TABUDA DA SOFRENCIA");
		System.out.println(" ");
		
		Scanner teclado= new Scanner(System.in);
		System.out.print("Digite um n?mero: ");
		multiplicador=teclado.nextInt();
				
		teclado.close();
		
		 
		
		while (multiplicando<=10) {
			
			total = multiplicando*multiplicador;
			
			System.out.println(multiplicando+" x "+multiplicador+" = "+total);
			
			multiplicando=multiplicando+1;
		}

		
	}

}
