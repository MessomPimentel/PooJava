package Aleatorio;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		Scanner m1 = new Scanner(System.in);
		double n1, n2, n3, n4;
		double media, i, contAluno = 0;
		
		for(i = 0; i < 4; i++) {
			
			contAluno++;
			//recebe a primeira nota
			System.out.println("Aluno " + contAluno + " : digite sua 1ª nota");
			n1 = m1.nextInt();
					
			//recebe a segunda nota
			System.out.println("Aluno " + contAluno + " : digite sua 2ª nota");
			n2 = m1.nextInt();
			
			//recebe a terceira nota
			System.out.println("Aluno " + contAluno + " : digite sua 3ª nota");
			n3 = m1.nextInt();
			
			//recebe a quarta nota
			System.out.println("Aluno " + contAluno + " : digite sua 4ª nota");
			n4 = m1.nextInt();
		     
			//calculaa media
			media = (n1 + n2 + n3 + n4) / 4;
			System.out.println("A média do aluno " + contAluno + " é " + media);
					
			//mostra a nota do aluno
			if((media >= 0) && (media < 4)) {
				System.out.println("Nota V");
			}else if(media < 6) {
				System.out.println("Nota V");
			}else if(media > 7) {
				System.out.println("Nota A");
			}else if(media > 8) {
				System.out.println("Nota A");
			}else if(media <= 6) {
				System.out.println("Nota V");
			}else if(media > 7) {
				System.out.println("Nota A");
			}
			
		}
	}

}
