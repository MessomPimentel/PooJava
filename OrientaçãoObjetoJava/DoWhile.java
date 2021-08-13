package Aleatorio;
//DO-WHILE

//Esse comando executa o bloco dentro do comando "do" e depois avalia a expressão,
//o bloco deixa de ser executado após a expressão ficar falsa.

public class DoWhile {

	public static void main(String[] args) {
		int i = 1; // count ou cont
		int max = 10;

		System.out.println("Contando até " + max);

		while (i <= max) {
			System.out.println("Valor de i: " + i);
			i++;
		}
		System.out.println(i);//valor de 11
		
		do {
			i++;
			System.out.println("Valor de i: " + i);
		}while(i < 13);
		
			
	}

}
