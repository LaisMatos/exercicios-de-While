package condicaoMedia;

import java.util.Scanner;

public class CondicaoMedia {

	public static void main(String[] args) {
		
		
		String nome;
		double nota1,nota2,nota3,nota4,media;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um nome: ");
		nome=teclado.next();
		System.out.println("*********************************************************");
		System.out.print("Digite a primeira nota: ");
		nota1=teclado.nextDouble();
		System.out.print("Digite a seguda nota: ");
		nota2=teclado.nextDouble();
		System.out.print("Digite a terceira nota: ");
		nota3=teclado.nextDouble();
		System.out.print("Digite a quarta nota: ");
		nota4=teclado.nextDouble();
		
		teclado.close();
		
		media=(nota1+nota2+nota3+nota4)/4;
		
		System.out.println("************************************************************");
		
		
		// condição 'if - else if - else
		
		if(media>=6) {
			System.out.println("A média do(a) "+ nome+ " é: "+ media+ " APROVADO!");
			
		}else if (media<=5) {
			System.out.println("O aluno (a) "+ nome+ " está de RECUPERAÇÂO!");
			
		}else {
			System.out.println("O aluno (a) "+ nome+ " está REPROVADO!");
		}
		
		
		
		
		
		
		
	}

}
