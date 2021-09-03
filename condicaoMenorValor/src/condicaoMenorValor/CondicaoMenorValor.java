package condicaoMenorValor;

import java.util.Scanner;

public class CondicaoMenorValor {

	public static void main(String[] args) {
		
		int v1, v2, v3;
		
		
		Scanner teclado= new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		v1=teclado.nextInt();
		System.out.print("Digite o segundo número: ");
		v2=teclado.nextInt();
		System.out.print("Digite o terceiro número: ");
		v3=teclado.nextInt();
		
		teclado.close();
		
		// condição 
		
		if(v1>v2 && v1>v3) {
			System.out.println("O primeiro é o valor maior");;
		}else if(v2>v3 && v2>v1) {
			System.out.println(" O segundo é o valor maior");
		}else{
			System.out.println("O terceiro é o valor maior ");		
		}
		
		
		
		
		
		
	}

}
