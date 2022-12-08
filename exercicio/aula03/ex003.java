package aula3;

import java.io.IOException;
import java.util.Scanner;

public class ex003 {
	public static void main(String[] args) throws InterruptedException, IOException { 
	       try (Scanner teclado = new Scanner(System.in)) {
			int sum = 0;
			@SuppressWarnings("unused")
			int media = 0;
			int maior = 0;
			int menor = 0;
			   for (int i = 0; i < 6; i++) {
			       System.out.println("Digite o número");

			       int num = teclado.nextInt();
			       sum = sum + num;
			    
			       if(i==0) {
			           menor = num;
			           maior = num;
			       }	          
			       if(num >= maior) {
			           maior = num;
			       }	           
			       if(num <= menor) {
			           menor = num;
			       }	                 
			    
			   }  

			   System.out.println("A soma é "+sum);
			   System.out.println("A média é "+(sum/6));
			   System.out.println("O maior número é "+maior);
			   System.out.println("O menor número é "+menor);
		}

	}
}
