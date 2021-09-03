package condicaoMaiorMenor;

import java.util.Scanner;

public class CondicaoMaiorMenor {

	public static void main(String[] args) {
		
		int n1,n2,n3;
		
		Scanner teclado= new Scanner (System.in);
		System.out.print("Digite um número: ");
		n1=teclado.nextInt();
		System.out.print("Digite um número: ");
		n2=teclado.nextInt();
		System.out.print("Digite um número: ");
		n3=teclado.nextInt();
		
		teclado.close();
		
		if(n1>n2 && n1>n3) {
			System.out.println("O "+n1+ " é o maior");
		}else if(n2>n3 && n2>n1) {
			System.out.println("O "+n2+ " é o maior");
		}else {
			System.out.println("O "+n3+" é o maior");
		}
		
		
		
		
		
		
		
		
	}

}
