package repeticaoDeUmAcem;

public class RepeticaoDeUmAcem {

	public static void main(String[] args) {
		
		// contar de 0 a 100 e dizer quando o número for par ou impar
		
		
		int contador=0;
				
		while(contador<=100) {
			if(contador%2==0) {
				System.out.println(contador+"- Par");
			}else {
				System.out.println(contador+"- Impar");
			}
			
			contador = contador + 1;
			// o contador tem que ficar dentro do bloco do While. O ideal é que fique no final do while
			// se colocar a contagem no inicio(em cima do if) o programa somo 1 ao zera e começa a contar pelo 1
						
		}
		
	}

}
