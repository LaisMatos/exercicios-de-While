package condicaoMaiorMenor;

import java.util.Scanner;

public class CondicaoMaiorMenor {

	public static void main(String[] args) {
		
		int n1,n2,n3;
		
		Scanner teclado= new Scanner (System.in);
		System.out.print("Digite um n�mero: ");
		n1=teclado.nextInt();
		System.out.print("Digite um n�mero: ");
		n2=teclado.nextInt();
		System.out.print("Digite um n�mero: ");
		n3=teclado.nextInt();
		
		teclado.close();
		
		if(n1>n2 && n1>n3) {
			System.out.println("O "+n1+ " � o maior");
		}else if(n2>n3 && n2>n1) {
			System.out.println("O "+n2+ " � o maior");
		}else {
			System.out.println("O "+n3+" � o maior");
		}
		
		
		
		
		
		
		
		
	}

}
