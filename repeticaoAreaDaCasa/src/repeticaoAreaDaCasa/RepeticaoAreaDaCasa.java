package repeticaoAreaDaCasa;

import java.util.Scanner;

public class RepeticaoAreaDaCasa {

	public static void main(String[] args) {
	/*
	Elaborar um programa que possibilite calcular a �rea total de uma resid�ncia (sala, cozinha, quartos, varanda, etc.). 
	O programa deve solicitar a entrada do nome, a largura e o comprimento de um determinado c�modo. 
	Em seguida, deve apresentar a �rea do c�modo lido e tamb�m uma mensagem solicitando ao usu�rio a confirma��o de continuar calculando novos c�modos. 
	Caso o usu�rio responda "N", o programa dever� apresentar o valor total calculado da resid�ncia e encerrar o programa.

Exemplo de funcionamento:

-------------------------------
  Calculo de �rea de uma casa
-------------------------------

Qual o nome do c�modo? Sala
Qual a largura? 5
Qual o comprimento? 4
A sala tem 20 metros quadrados.

Voc� deseja calcular mais c�modos(S/N)? S

Qual o nome do c�modo? Cozinha
Qual a largura? 6
Qual o comprimento? 3
A cozinha tem 18 metros quadrados.

Voc� deseja calcular mais c�modos(S/N)? N

A �rea total da casa � 38 metros quadrados.

** F I M **
 */
		
		
		// s � diferente de S, o mesmo serve para o n
		 double
		 
		Scanner teclado= new Scanner(System.in);
		 
		System.out.println("Qual o c�modo?  ");
		System.out.println("Qual a largura? ");
		System.out.println("Qual comprimento? ");
		System.out.println("A �rea do c�modo �: ");
		
		System.out.println("Deseja calcular mais comodos? ");
		
		
		
		teclado.close();

	}

}
