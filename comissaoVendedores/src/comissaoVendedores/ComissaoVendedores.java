package comissaoVendedores;

import java.util.Scanner;

public class ComissaoVendedores {

	public static void main(String[] args) {
		
		String nome;
		double totalVendido, comissao;
		
		Scanner teclado=new Scanner(System.in); 
		
		System.out.print("Nome do vendedor: ");
		nome=teclado.next();
		
		System.out.println("Total vendido: ");
		totalVendido=teclado.nextDouble();
		
		
		teclado.close();
	}

}
