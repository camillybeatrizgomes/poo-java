package aula2;

import java.util.Scanner;

public class ex002Questao1 {
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.print("digite sua idade: \n");
			int idade = teclado.nextInt();
			int mes = 12;
			int dias = 365;
			System.out.println("Sua idade em dias é "+(idade*dias));
			System.out.println("Sua idade em meses é "+(idade*mes));
			System.out.println("Sua idade em anos é "+(idade));
		}
		

	}
}
