package condicaoMaiorValor2;
import java.util.Scanner;
public class CondicaoMaior2 {

	public static void main(String[] args) {
		
		
		int v1, v2, v3, maior1, maior2;
		
		
		Scanner teclado= new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		v1=teclado.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		v2=teclado.nextInt();
		System.out.print("Digite o terceiro n�mero: ");
		v3=teclado.nextInt();
		
		teclado.close();
		
		// condi��o 
		
		if(v1>v2) {
			maior1=v1;
		}else if(v1>v3) {
			System.out.println(" O primeiro � o valor maior");
		}else if(v2>v3){
			maior2=v2;	
		}else {
			System.out.println("O terceiro � o ");
		}
		
		
		
		
	}

}
