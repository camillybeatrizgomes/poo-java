package aula2;

import java.util.Scanner;

public class ex002Questao4 {
	public static void main(String[] args) {

		try (Scanner teclado = new Scanner(System.in)) {
			System.out.print("digite um numero: \n");
			int tabuada = teclado.nextInt();
			for (int mult = 0; mult <= 10; mult++){
				int calc = tabuada * mult;
			
			System.out.println(tabuada+" x "+ mult +" = "+ calc);
			}
		}
	}
}
