package repeticaoMultiploDeQuatro;

public class RepeticaoMultiploDeQuatro {

	public static void main(String[] args) {
		
		int contador=0;
		
		while (contador<=100){
			
			//aqui contador = contador+1 come�a por 1
			
			if(contador%4==0) {
				System.out.println(contador+"- Par");
			}else {
				System.out.println(contador+"- Impar");
			}
					
			contador = contador+1; // aqui eu come�o contando pelo zero
						
			
		}
		
		

	}

}
